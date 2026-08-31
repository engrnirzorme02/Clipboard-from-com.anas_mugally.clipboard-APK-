package com.google.protobuf;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.protobuf.W */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC5084W {

    /* JADX INFO: renamed from: a */
    private static final char[] f19349a;

    static {
        char[] cArr = new char[80];
        f19349a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: renamed from: a */
    private static void m22978a(int i7, StringBuilder sb) {
        while (i7 > 0) {
            char[] cArr = f19349a;
            int length = i7 > cArr.length ? cArr.length : i7;
            sb.append(cArr, 0, length);
            i7 -= length;
        }
    }

    /* JADX INFO: renamed from: b */
    private static boolean m22979b(Object obj) {
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() == 0;
        }
        if (obj instanceof Float) {
            return Float.floatToRawIntBits(((Float) obj).floatValue()) == 0;
        }
        if (obj instanceof Double) {
            return Double.doubleToRawLongBits(((Double) obj).doubleValue()) == 0;
        }
        if (obj instanceof String) {
            return obj.equals("");
        }
        if (obj instanceof AbstractC5104i) {
            return obj.equals(AbstractC5104i.f19401b);
        }
        if (obj instanceof InterfaceC5082U) {
            return obj == ((InterfaceC5082U) obj).mo22976a();
        }
        return (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
    }

    /* JADX INFO: renamed from: c */
    private static String m22980c(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toLowerCase(str.charAt(0)));
        for (int i7 = 1; i7 < str.length(); i7++) {
            char cCharAt = str.charAt(i7);
            if (Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    static void m22981d(StringBuilder sb, int i7, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m22981d(sb, i7, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m22981d(sb, i7, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        m22978a(i7, sb);
        sb.append(m22980c(str));
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(AbstractC5123r0.m23576c((String) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC5104i) {
            sb.append(": \"");
            sb.append(AbstractC5123r0.m23574a((AbstractC5104i) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC5136y) {
            sb.append(" {");
            m22982e((AbstractC5136y) obj, sb, i7 + 2);
            sb.append("\n");
            m22978a(i7, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i8 = i7 + 2;
        m22981d(sb, i8, "key", entry.getKey());
        m22981d(sb, i8, "value", entry.getValue());
        sb.append("\n");
        m22978a(i7, sb);
        sb.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0174  */
    /* JADX WARN: Code duplicated, block: B:66:0x0191  */
    /* JADX WARN: Code duplicated, block: B:68:0x0199  */
    /* JADX WARN: Code duplicated, block: B:70:0x019f  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:91:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:64:0x0174, please report this as an issue */
    /* JADX INFO: renamed from: e */
    private static void m22982e(InterfaceC5082U interfaceC5082U, StringBuilder sb, int i7) {
        int i8;
        int i9;
        Method method;
        Method method2;
        Object objM23685G;
        boolean zBooleanValue;
        Method method3;
        Method method4;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = interfaceC5082U.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i10 = 0;
        while (true) {
            i8 = 3;
            if (i10 >= length) {
                break;
            }
            Method method5 = declaredMethods[i10];
            if (!Modifier.isStatic(method5.getModifiers()) && method5.getName().length() >= 3) {
                if (method5.getName().startsWith("set")) {
                    hashSet.add(method5.getName());
                } else if (Modifier.isPublic(method5.getModifiers()) && method5.getParameterTypes().length == 0) {
                    if (method5.getName().startsWith("has")) {
                        map.put(method5.getName(), method5);
                    } else if (method5.getName().startsWith("get")) {
                        treeMap.put(method5.getName(), method5);
                    }
                }
            }
            i10++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i8);
            if (!strSubstring.endsWith("List") || strSubstring.endsWith("OrBuilderList") || strSubstring.equals("List") || (method4 = (Method) entry.getValue()) == null) {
                i9 = i8;
            } else {
                i9 = i8;
                if (method4.getReturnType().equals(List.class)) {
                    m22981d(sb, i7, strSubstring.substring(0, strSubstring.length() - 4), AbstractC5136y.m23685G(method4, interfaceC5082U, new Object[0]));
                }
                i8 = i9;
            }
            if (!strSubstring.endsWith("Map") || strSubstring.equals("Map") || (method3 = (Method) entry.getValue()) == null || !method3.getReturnType().equals(Map.class) || method3.isAnnotationPresent(Deprecated.class) || !Modifier.isPublic(method3.getModifiers())) {
                if (hashSet.contains("set" + strSubstring)) {
                    if (strSubstring.endsWith("Bytes")) {
                        if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                            method = (Method) entry.getValue();
                            method2 = (Method) map.get("has" + strSubstring);
                            if (method != null) {
                                objM23685G = AbstractC5136y.m23685G(method, interfaceC5082U, new Object[0]);
                                if (method2 == null) {
                                    zBooleanValue = ((Boolean) AbstractC5136y.m23685G(method2, interfaceC5082U, new Object[0])).booleanValue();
                                } else if (m22979b(objM23685G)) {
                                    zBooleanValue = false;
                                } else {
                                    zBooleanValue = true;
                                }
                                if (zBooleanValue) {
                                    m22981d(sb, i7, strSubstring, objM23685G);
                                }
                            }
                        }
                    } else {
                        method = (Method) entry.getValue();
                        method2 = (Method) map.get("has" + strSubstring);
                        if (method != null) {
                            objM23685G = AbstractC5136y.m23685G(method, interfaceC5082U, new Object[0]);
                            if (method2 == null) {
                                zBooleanValue = ((Boolean) AbstractC5136y.m23685G(method2, interfaceC5082U, new Object[0])).booleanValue();
                            } else if (m22979b(objM23685G)) {
                                zBooleanValue = true;
                            } else {
                                zBooleanValue = false;
                            }
                            if (zBooleanValue) {
                                m22981d(sb, i7, strSubstring, objM23685G);
                            }
                        }
                    }
                }
            } else {
                m22981d(sb, i7, strSubstring.substring(0, strSubstring.length() - 3), AbstractC5136y.m23685G(method3, interfaceC5082U, new Object[0]));
            }
            i8 = i9;
        }
        C5131v0 c5131v0 = ((AbstractC5136y) interfaceC5082U).unknownFields;
        if (c5131v0 != null) {
            c5131v0.m23654m(sb, i7);
        }
    }

    /* JADX INFO: renamed from: f */
    static String m22983f(InterfaceC5082U interfaceC5082U, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m22982e(interfaceC5082U, sb, 0);
        return sb.toString();
    }
}
