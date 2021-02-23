    public class com.cas.config.topic.TopicRabbitConfig
      minor version: 0
      major version: 52
      flags: (0x0021) ACC_PUBLIC, ACC_SUPER
      this_class: #3                          // com/cas/config/topic/TopicRabbitConfig
      super_class: #17                        // java/lang/Object
      interfaces: 0, fields: 2, methods: 6, attributes: 3
    Constant pool:
       #1 = Methodref          #17.#42        // java/lang/Object."<init>":()V
       #2 = Class              #43            // org/springframework/amqp/core/Queue
       #3 = Class              #44            // com/cas/config/topic/TopicRabbitConfig
       #4 = String             #45            // topic.man
       #5 = Methodref          #2.#46         // org/springframework/amqp/core/Queue."<init>":(Ljava/lang/String;)V
       #6 = String             #47            // topic.woman
       #7 = Class              #48            // org/springframework/amqp/core/TopicExchange
       #8 = String             #34            // topicExchange
       #9 = Methodref          #7.#46         // org/springframework/amqp/core/TopicExchange."<init>":(Ljava/lang/String;)V
      #10 = Methodref          #3.#49         // com/cas/config/topic/TopicRabbitConfig.manQueue:()Lorg/springframework/amqp/core/Queue;
      #11 = Methodref          #50.#51        // org/springframework/amqp/core/BindingBuilder.bind:(Lorg/springframework/amqp/core/Queue;)Lorg/springframework/amqp/core/BindingBuilder$DestinationConfigurer;
      #12 = Methodref          #3.#52         // com/cas/config/topic/TopicRabbitConfig.topicExchange:()Lorg/springframework/amqp/core/TopicExchange;
      #13 = Methodref          #53.#54        // org/springframework/amqp/core/BindingBuilder$DestinationConfigurer.to:(Lorg/springframework/amqp/core/TopicExchange;)Lorg/springframework/amqp/core/BindingBuilder$TopicExchangeRoutingKeyConfigurer;
      #14 = Methodref          #55.#56        // org/springframework/amqp/core/BindingBuilder$TopicExchangeRoutingKeyConfigurer.with:(Ljava/lang/String;)Lorg/springframework/amqp/core/Binding;
      #15 = Methodref          #3.#57         // com/cas/config/topic/TopicRabbitConfig.woManQueue:()Lorg/springframework/amqp/core/Queue;
      #16 = String             #58            // topic.#
      #17 = Class              #59            // java/lang/Object
      #18 = Utf8               MAN
      #19 = Utf8               Ljava/lang/String;
      #20 = Utf8               ConstantValue
      #21 = Utf8               WOMAN
      #22 = Utf8               <init>
      #23 = Utf8               ()V
      #24 = Utf8               Code
      #25 = Utf8               LineNumberTable
      #26 = Utf8               LocalVariableTable
      #27 = Utf8               this
      #28 = Utf8               Lcom/cas/config/topic/TopicRabbitConfig;
      #29 = Utf8               manQueue
      #30 = Utf8               ()Lorg/springframework/amqp/core/Queue;
      #31 = Utf8               RuntimeVisibleAnnotations
      #32 = Utf8               Lorg/springframework/context/annotation/Bean;
      #33 = Utf8               woManQueue
      #34 = Utf8               topicExchange
      #35 = Utf8               ()Lorg/springframework/amqp/core/TopicExchange;
      #36 = Utf8               bindingExchangeMessage
      #37 = Utf8               ()Lorg/springframework/amqp/core/Binding;
      #38 = Utf8               bindingExchangeMessage2
      #39 = Utf8               SourceFile
      #40 = Utf8               TopicRabbitConfig.java
      #41 = Utf8               Lorg/springframework/context/annotation/Configuration;
      #42 = NameAndType        #22:#23        // "<init>":()V
      #43 = Utf8               org/springframework/amqp/core/Queue
      #44 = Utf8               com/cas/config/topic/TopicRabbitConfig
      #45 = Utf8               topic.man
      #46 = NameAndType        #22:#60        // "<init>":(Ljava/lang/String;)V
      #47 = Utf8               topic.woman
      #48 = Utf8               org/springframework/amqp/core/TopicExchange
      #49 = NameAndType        #29:#30        // manQueue:()Lorg/springframework/amqp/core/Queue;
      #50 = Class              #61            // org/springframework/amqp/core/BindingBuilder
      #51 = NameAndType        #62:#65        // bind:(Lorg/springframework/amqp/core/Queue;)Lorg/springframework/amqp/core/BindingBuilder$DestinationConfigurer;
      #52 = NameAndType        #34:#35        // topicExchange:()Lorg/springframework/amqp/core/TopicExchange;
      #53 = Class              #66            // org/springframework/amqp/core/BindingBuilder$DestinationConfigurer
      #54 = NameAndType        #67:#69        // to:(Lorg/springframework/amqp/core/TopicExchange;)Lorg/springframework/amqp/core/BindingBuilder$TopicExchangeRoutingKeyConfigurer;
      #55 = Class              #70            // org/springframework/amqp/core/BindingBuilder$TopicExchangeRoutingKeyConfigurer
      #56 = NameAndType        #71:#72        // with:(Ljava/lang/String;)Lorg/springframework/amqp/core/Binding;
      #57 = NameAndType        #33:#30        // woManQueue:()Lorg/springframework/amqp/core/Queue;
      #58 = Utf8               topic.#
      #59 = Utf8               java/lang/Object
      #60 = Utf8               (Ljava/lang/String;)V
      #61 = Utf8               org/springframework/amqp/core/BindingBuilder
      #62 = Utf8               bind
      #63 = Utf8               DestinationConfigurer
      #64 = Utf8               InnerClasses
      #65 = Utf8               (Lorg/springframework/amqp/core/Queue;)Lorg/springframework/amqp/core/BindingBuilder$DestinationConfigurer;
      #66 = Utf8               org/springframework/amqp/core/BindingBuilder$DestinationConfigurer
      #67 = Utf8               to
      #68 = Utf8               TopicExchangeRoutingKeyConfigurer
      #69 = Utf8               (Lorg/springframework/amqp/core/TopicExchange;)Lorg/springframework/amqp/core/BindingBuilder$TopicExchangeRoutingKeyConfigurer;
      #70 = Utf8               org/springframework/amqp/core/BindingBuilder$TopicExchangeRoutingKeyConfigurer
      #71 = Utf8               with
      #72 = Utf8               (Ljava/lang/String;)Lorg/springframework/amqp/core/Binding;
    {
      public com.cas.config.topic.TopicRabbitConfig();
        descriptor: ()V
        flags: (0x0001) ACC_PUBLIC
        Code:
          stack=1, locals=1, args_size=1
             0: aload_0
             1: invokespecial #1                  // Method java/lang/Object."<init>":()V
             4: return
          LineNumberTable:
            line 17: 0
          LocalVariableTable:
            Start  Length  Slot  Name   Signature
                0       5     0  this   Lcom/cas/config/topic/TopicRabbitConfig;
    
      public org.springframework.amqp.core.Queue manQueue();
        descriptor: ()Lorg/springframework/amqp/core/Queue;
        flags: (0x0001) ACC_PUBLIC
        Code:
          stack=3, locals=1, args_size=1
             0: new           #2                  // class org/springframework/amqp/core/Queue
             3: dup
             4: ldc           #4                  // String topic.man
             6: invokespecial #5                  // Method org/springframework/amqp/core/Queue."<init>":(Ljava/lang/String;)V
             9: areturn
          LineNumberTable:
            line 24: 0
          LocalVariableTable:
            Start  Length  Slot  Name   Signature
                0      10     0  this   Lcom/cas/config/topic/TopicRabbitConfig;
        RuntimeVisibleAnnotations:
          0: #32()
            org.springframework.context.annotation.Bean
    
      public org.springframework.amqp.core.Queue woManQueue();
        descriptor: ()Lorg/springframework/amqp/core/Queue;
        flags: (0x0001) ACC_PUBLIC
        Code:
          stack=3, locals=1, args_size=1
             0: new           #2                  // class org/springframework/amqp/core/Queue
             3: dup
             4: ldc           #6                  // String topic.woman
             6: invokespecial #5                  // Method org/springframework/amqp/core/Queue."<init>":(Ljava/lang/String;)V
             9: areturn
          LineNumberTable:
            line 29: 0
          LocalVariableTable:
            Start  Length  Slot  Name   Signature
                0      10     0  this   Lcom/cas/config/topic/TopicRabbitConfig;
        RuntimeVisibleAnnotations:
          0: #32()
            org.springframework.context.annotation.Bean
    
      org.springframework.amqp.core.TopicExchange topicExchange();
        descriptor: ()Lorg/springframework/amqp/core/TopicExchange;
        flags: (0x0000)
        Code:
          stack=3, locals=1, args_size=1
             0: new           #7                  // class org/springframework/amqp/core/TopicExchange
             3: dup
             4: ldc           #8                  // String topicExchange
             6: invokespecial #9                  // Method org/springframework/amqp/core/TopicExchange."<init>":(Ljava/lang/String;)V
             9: areturn
          LineNumberTable:
            line 34: 0
          LocalVariableTable:
            Start  Length  Slot  Name   Signature
                0      10     0  this   Lcom/cas/config/topic/TopicRabbitConfig;
        RuntimeVisibleAnnotations:
          0: #32()
            org.springframework.context.annotation.Bean
    
      org.springframework.amqp.core.Binding bindingExchangeMessage();
        descriptor: ()Lorg/springframework/amqp/core/Binding;
        flags: (0x0000)
        Code:
          stack=2, locals=1, args_size=1
             0: aload_0
             1: invokevirtual #10                 // Method manQueue:()Lorg/springframework/amqp/core/Queue;
             4: invokestatic  #11                 // Method org/springframework/amqp/core/BindingBuilder.bind:(Lorg/springframework/amqp/core/Queue;)Lorg/springframework/amqp/core/BindingBuilder$DestinationConfigurer;
             7: aload_0
             8: invokevirtual #12                 // Method topicExchange:()Lorg/springframework/amqp/core/TopicExchange;
            11: invokevirtual #13                 // Method org/springframework/amqp/core/BindingBuilder$DestinationConfigurer.to:(Lorg/springframework/amqp/core/TopicExchange;)Lorg/springframework/amqp/core/BindingBuilder$TopicExchangeRoutingKeyConfigurer;
            14: ldc           #4                  // String topic.man
            16: invokevirtual #14                 // Method org/springframework/amqp/core/BindingBuilder$TopicExchangeRoutingKeyConfigurer.with:(Ljava/lang/String;)Lorg/springframework/amqp/core/Binding;
            19: areturn
          LineNumberTable:
            line 39: 0
          LocalVariableTable:
            Start  Length  Slot  Name   Signature
                0      20     0  this   Lcom/cas/config/topic/TopicRabbitConfig;
        RuntimeVisibleAnnotations:
          0: #32()
            org.springframework.context.annotation.Bean
    
      org.springframework.amqp.core.Binding bindingExchangeMessage2();
        descriptor: ()Lorg/springframework/amqp/core/Binding;
        flags: (0x0000)
        Code:
          stack=2, locals=1, args_size=1
             0: aload_0
             1: invokevirtual #15                 // Method woManQueue:()Lorg/springframework/amqp/core/Queue;
             4: invokestatic  #11                 // Method org/springframework/amqp/core/BindingBuilder.bind:(Lorg/springframework/amqp/core/Queue;)Lorg/springframework/amqp/core/BindingBuilder$DestinationConfigurer;
             7: aload_0
             8: invokevirtual #12                 // Method topicExchange:()Lorg/springframework/amqp/core/TopicExchange;
            11: invokevirtual #13                 // Method org/springframework/amqp/core/BindingBuilder$DestinationConfigurer.to:(Lorg/springframework/amqp/core/TopicExchange;)Lorg/springframework/amqp/core/BindingBuilder$TopicExchangeRoutingKeyConfigurer;
            14: ldc           #16                 // String topic.#
            16: invokevirtual #14                 // Method org/springframework/amqp/core/BindingBuilder$TopicExchangeRoutingKeyConfigurer.with:(Ljava/lang/String;)Lorg/springframework/amqp/core/Binding;
            19: areturn
          LineNumberTable:
            line 45: 0
          LocalVariableTable:
            Start  Length  Slot  Name   Signature
                0      20     0  this   Lcom/cas/config/topic/TopicRabbitConfig;
        RuntimeVisibleAnnotations:
          0: #32()
            org.springframework.context.annotation.Bean
    }
    SourceFile: "TopicRabbitConfig.java"
    RuntimeVisibleAnnotations:
      0: #41()
        org.springframework.context.annotation.Configuration
    InnerClasses:
      public static final #63= #53 of #50;    // DestinationConfigurer=class org/springframework/amqp/core/BindingBuilder$DestinationConfigurer of class org/springframework/amqp/core/BindingBuilder
      public static final #68= #55 of #50;    // TopicExchangeRoutingKeyConfigurer=class org/springframework/amqp/core/BindingBuilder$TopicExchangeRoutingKeyConfigurer of class org/springframework/amqp/core/BindingBuilder
