package com.system.restaurant.seguridad;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            // Configura las solicitudes autorizadas
            .authorizeHttpRequests(authz -> authz
                .requestMatchers("/").permitAll()
                .requestMatchers("/img/**").permitAll()
                .requestMatchers("/css/**").permitAll()
                .requestMatchers("/externos/**").permitAll()
                .requestMatchers("/Api/**").permitAll()
            		.anyRequest().authenticated() // Requiere autenticación para cualquier solicitud
            )
            // Configura el formulario de inicio de sesión
            .formLogin(form -> form
                .loginPage("/registro") // Especifica la ruta a tu página personalizada
                .permitAll() // Permite el acceso a todos a la página de inicio de sesión
            );
        return http.build();
    }
}
