package notes.Java_EE_JSON_Processing;

public class JsonProcessing {

/*
    Java and JSON fit together very nicely. There are no hacks or awkward relationships to force cooperation.
    In fact, Java and JSON are really very well suited for each other; and this is no coincidence.
    JSON derives from JavaScript, which has a very similar syntax to Java

    Arguably, one of the most common usages of JSON is in the interchange of data between a client and a RESTful API.
     A RESTful API implements the REST architectural pattern, where REST means representational state transfer.
     So, what does this mean? Well, without going into lots of detail, often what this boils down to is the civilization of
     a plain old Java object represented as a JSON string.

    Connected with the REST paradigm is the use of JSON web tokens, JWT, to implement security concerns. JWT is an open source specification
    that can be used across REST-compliant systems and is not just restricted to use in Java applications,
    but any application that understands JSON. A JSON web token is used to create axis tokens that assert a claim,
    usually in relation to authorization; but often they are used to pass the identity of authenticated users between systems.

    it specifies that the JSON data can be processed with two models. An object model and a streaming model.

    JSON binding is the mapping of JSON data to a POJO and is specified in another JSR designed for this purpose

    Both the streaming and the object models can generate JSON data, and I'll put it to a stream such as FAT file for
    offline processing and storage. And both models can read data efficiently. However, the streaming model is especially
    efficient at processing high volumes of JSON data. This allows for the implementation of data import functionality,
    and the transformation of data on the fly. Don't confuse this API with JSON with padding, which is also referred
    to as JSON-P. This can be especially confusing when searching for it in a search engine.

    he JSON-P JSR specifies features for generating, parsing, querying, and transforming JSON data.
    It provides two models. An object model and a streaming model that provide different ways to build and process JSON documents.
    The API consists of three packages.

    The JSON P model is a memory-based model, which loads the entire JSON document into memory. As it is loaded,
    it is parsed into a JSON object structure, with the JsonValue class at the top. All classes related to the
    object model are located in the the JSON X dot JSON package and consists of the following principle APIs.
    JsonBuilder, JsonReader, and JsonWriter
   */
}
