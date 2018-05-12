//
//Nedenstående kode er taget fra denne hjemmeside.
// [Guide] Implementing API Gateway pattern with Netflix Zuul and Spring Cloud.
// Udgivet af Kasper Nissen. Sidst opdateret: 05.04.2016.
// Internetadresse: http://kubecloud.io/apigatewaypattern/
// - Besøgt d. 30.05.2017 (Internet)
//Backup af hjemmeside http://archive.is/NQSDE

package com.si;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class Apigateway3Application {

    public static void main(String[] args) {

        SpringApplication.run(Apigateway3Application.class, args);
    }

}






