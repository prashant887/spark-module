Objective
--
Objective is to decouple dependent modules and executing models and create Thin Jars 

Dependent Common Module : https://github.com/prashant887/modules-common.git
bin/spark-submit \
--jars /Users/pl/IdeaProjects/modules-common/target/scala-2.13/modules-common_2.13-0.1.0-SNAPSHOT.jar \
--master local \
--class summary.execute \
/Users/pl/IdeaProjects/spark-module/target/scala-2.13/spark-module_2.13-0.1.0-SNAPSHOT.jar


bin/spark-submit \
--packages com.prashant:modules-common_2.13:0.1.0-SNAPSHOT \
--master local \
--class summary.execute \
/Users/pl/IdeaProjects/spark-module/target/scala-2.13/spark-module_2.13-0.1.0-SNAPSHOT.jar
