package com.pasim.blogApp.service;

import com.pasim.blogApp.payload.LoginDto;
import com.pasim.blogApp.payload.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);

    String register(RegisterDto registerDto);

}
