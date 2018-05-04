package com.vastsum.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.vastsum.entity.CommunicationLog;
import com.vastsum.entity.CommunicationLogExample;
import com.vastsum.entity.vo.CommLogVO;
import com.vastsum.enums.OptionType;
import com.vastsum.service.ConnectService;
import com.vastsum.dao.CommunicationLogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ssj
 * @create 2017-11-19 13:26
 */
@Service
public class ConnectServiceImpl implements ConnectService {

    @Autowired
    private CommunicationLogMapper communicationLogMapper;

    //列出所有服务
    @Override
    public List<CommLogVO> listAll() {
        CommunicationLogExample commExample = new CommunicationLogExample();
        commExample.setOrderByClause("gmt_create desc");
        List<CommunicationLog> communicationLogs = communicationLogMapper.selectByExample(commExample);
        List<CommLogVO> commLogVOList = new ArrayList<>();
        communicationLogs.forEach(e -> {
            CommLogVO commLogVO = getCommLogVO(e);
            commLogVOList.add(commLogVO);
        });
        return commLogVOList;
    }

    //根据条件查询连接信息
    @Override
    public PageInfo<CommLogVO> pageByCommunicationLog(CommunicationLog c, int page, int pageSize) {
        CommunicationLogExample commExample = new CommunicationLogExample();
        commExample.setOrderByClause("gmt_create desc");
       
        page = page == 0? 1:page;
        pageSize = pageSize == 0? 10:pageSize;
        CommunicationLogExample.Criteria criteria = commExample.createCriteria();
        if (c == null){
        	 PageHelper.startPage(page,pageSize);
            List<CommunicationLog> communicationLogs = communicationLogMapper.selectByExample(commExample);
            List<CommLogVO> commLogVOList = new ArrayList<>();
            communicationLogs.forEach(e -> {
                CommLogVO commLogVO = getCommLogVO(e);
                commLogVOList.add(commLogVO);
            });
            return new PageInfo<>(commLogVOList);
        }
        
        String sn = c.getSn();
        if (sn != null){
            criteria.andSnEqualTo(sn);
        }
        Integer serverPort = c.getServerPort();
        if (serverPort != null){
            criteria.andServerPortEqualTo(serverPort);
        }
        Integer optionType = c.getOptionType();
        if (optionType != null){
            criteria.andOptionTypeEqualTo(optionType);
        }
       
        PageHelper.startPage(page,pageSize);
        List<CommunicationLog> communicationLogs = communicationLogMapper.selectByExample(commExample);
        List<CommLogVO> commLogVOList = new ArrayList<>();
        communicationLogs.forEach(e -> {
            CommLogVO commLogVO = getCommLogVO(e);
            commLogVOList.add(commLogVO);
        });
        return new PageInfo<>(commLogVOList);
    }

    //获取一条记录详情
    @Override
    public CommLogVO getCommunicationLog(long connectionId) {
        CommunicationLog communicationLog = communicationLogMapper.selectByPrimaryKey(connectionId);
        return getCommLogVO(communicationLog);
    }

    //保存
    @Override
    public int save(CommunicationLog communicationLog) {
       return communicationLogMapper.insert(communicationLog);
    }

    //修改
    @Override
    public int update(CommunicationLog communicationLog) {
        return communicationLogMapper.updateByPrimaryKey(communicationLog);
    }

    //删除
    @Override
    public int delete(long connectionId) {
        return communicationLogMapper.deleteByPrimaryKey(connectionId);
    }

    //包装返回视图
    private CommLogVO getCommLogVO(CommunicationLog c){
        CommLogVO commLogVO = new CommLogVO();
        commLogVO.setClientConnectionId(c.getClientConnectionId());
        commLogVO.setClientPort(c.getClientPort());
        commLogVO.setClientIpAddress(c.getClientIpAddress());
        commLogVO.setServerPort(c.getServerPort());
        commLogVO.setServerIpAddress(c.getServerIpAddress());
        commLogVO.setOptionType(c.getOptionType());
        commLogVO.setGmtCreate(c.getGmtCreate());
        commLogVO.setSn(c.getSn());
        commLogVO.setServerNetAddress(c.getServerNetAddress());
        if (OptionType.CONNECT.getValue().equals(c.getOptionType())){
            commLogVO.setOptionTypeName(OptionType.CONNECT.getName());
        }
        if (OptionType.DISCONNECT.getValue().equals(c.getOptionType())){
            commLogVO.setOptionTypeName(OptionType.DISCONNECT.getName());
        }
        return commLogVO;

    }
}
