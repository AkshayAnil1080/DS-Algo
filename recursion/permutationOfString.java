����   : T  recursion/permutationOfString  java/lang/Object set Ljava/util/Set; 	Signature #Ljava/util/Set<Ljava/lang/String;>; <clinit> ()V Code  java/util/HashSet
    
 <init>	     LineNumberTable LocalVariableTable
   this Lrecursion/permutationOfString; main ([Ljava/lang/String;)V  acc
     permutations (Ljava/lang/String;II)V args [Ljava/lang/String; # % $ java/util/Set & ' contains (Ljava/lang/Object;)Z # ) * ' add	 , . - java/lang/System / 0 out Ljava/io/PrintStream;
 2 4 3 java/io/PrintStream 5 6 println (Ljava/lang/String;)V
  8 9 : interchangeChar ((Ljava/lang/String;II)Ljava/lang/String; s Ljava/lang/String; l I r i StackMapTable
 C E D java/lang/String F G toCharArray ()[C
 C I J K valueOf ([C)Ljava/lang/String; a b array [C temp C 
SourceFile permutationOfString.java !                 	 
     +      � Y� � �                    
     /     *� �                        	       6     � �       
                 !          �     H� "� *� " � �� *� ( W� +*� 1�>� *� 7K*`� *� 7K����       .           #  $  )  0  8  ?  G !    *    H ; <     H = >    H ? >  & ! @ >  A   	 �   9 :     |     *� BN-46--4U-U-� H�           %  & 
 '  (  *    4     ; <      L >     M >    N O  
  P Q   R    S