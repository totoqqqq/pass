package kh.nt.pass.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kh.nt.pass.dao.ServiceDAO;
import kh.nt.pass.model.ServiceBoard;
import kh.nt.pass.model.ServiceFile;

//interface (ServiceService interface)의 구체클래스.
@Service //Service Class임을 Spring에 명시
public class ServiceServiceImpl implements ServiceService{
	@Autowired // 바로 아랫줄 1줄의 변수의 [타입] Bean 자동세팅.(단 Spring에 등록된 빈만 가능하다.)
	private ServiceDAO sd;

	@Override
	public boolean createboard(ServiceBoard serviceboard) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean createboard(ServiceBoard serviceboard, ServiceFile servicefile) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ServiceBoard listboard(ServiceBoard serviceboard) {
		// TODO Auto-generated method stub
		return null;
	}
}