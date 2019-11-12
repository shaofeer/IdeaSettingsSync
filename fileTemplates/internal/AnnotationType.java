#if (${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

#if (${IMPORT_BLOCK} != "")${IMPORT_BLOCK}
#end
#parse("File Header.java")
public  @interface ${NAME} #if (${INTERFACES} != "")extends ${INTERFACES} #end {
}
