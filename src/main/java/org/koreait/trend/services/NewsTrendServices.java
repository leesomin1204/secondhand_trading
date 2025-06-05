package org.koreait.trend.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class NewsTrendServices {
    @Value("${python.path.base}")
    private String pythonDir;
}
