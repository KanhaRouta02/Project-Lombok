Project Lombok
==============

-> Project Lombok is a third party library.

-> It is used to avoid boiler-plate-code in project.

-> Project Lombok will generate below things for our classes.

1) setter methods
2) getter methods
3) 0-param constructor
4) param-constructor
5) toString ( ) method
6) equals ( ) method
7) hashCode ( )


Project Lombok Setup
====================

Step-1) Add Lombok Dependency in pom.xml file.

    <!-- https://mvnrepository.com/artifact/org.projectlombok/lombok -->
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>1.18.34</version>
            <scope>provided</scope>
        </dependency>

Step-2) Install Lombok jar in our IDE (Eclipse / STS / IntelliJ)

        -> Goto lombok jar location
        
                     C (Drive) -> User -> admin -> m2 -> repository -> org -> projectlombok -> Lombok 
                         -> Version (what u added in your pom.xml ) -> Lombok jar file => that location open cmd

        -> execute below command

                      $ java -jar <lombok-jar-file-name>

        -> Specify IDE location (eclipse.exe / STS.exe)        

        -> Click on install

        -> Close installer

        -> Re-Start IDE

Note ✅ : Step-2 is required only first time.  

Project Lombok Annotations
==========================

=> Project Lombok provided annotations to generate boiler plate code.
1) @Setter : To generate setter methods for variables
2) @Getter : To generate getter methods for variables
3) @ToString : To generate toString ( ) method
4) @NoArgsConstructor : To generate 0-param constructor
5) @AllArgsConstructor : To generate param-constructor
6) @EqualsAndHashCode : To generate equals () & hashCode ( ) methods
7) @Data  = 
	 @Setter + @Getter + @NoArgsConstructor + @ToString + @EqualsAndHashCode



                     
        
