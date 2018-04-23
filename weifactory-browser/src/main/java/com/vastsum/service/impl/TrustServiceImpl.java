package com.vastsum.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vastsum.dao.DeviceMapper;
import com.vastsum.entity.Device;
import com.vastsum.service.TrustService;

@Service
public class TrustServiceImpl implements TrustService {
	
	@Autowired
	private DeviceMapper deviceMapper;

	@Override
	public void trust(Integer deviceId, String trustStatus) {
		Device device = new Device();
		device.setDeviceId(deviceId);
		device.setTrustStatus(trustStatus);
		deviceMapper.updateByPrimaryKeySelective(device);
	}

	@Override
	public void cancelTrust(Integer deviceId) {
		trust(deviceId, "0");
	}

	@Override
	public void serverTrust(Integer deviceId) {
		trust(deviceId, "1");
	}

	@Override
	public void expertTrust(Integer deviceId) {
		trust(deviceId, "2");
	}


}
