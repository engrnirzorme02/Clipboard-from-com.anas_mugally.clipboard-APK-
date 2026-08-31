package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.L */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2488L {

    /* JADX INFO: renamed from: a */
    private static final char[] f9441a;

    static {
        char[] cArr = new char[80];
        f9441a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: renamed from: a */
    private static void m10901a(int i7, StringBuilder sb) {
        while (i7 > 0) {
            char[] cArr = f9441a;
            int length = i7 > cArr.length ? cArr.length : i7;
            sb.append(cArr, 0, length);
            i7 -= length;
        }
    }

    /* JADX INFO: renamed from: b */
    private static boolean m10902b(Object obj) {
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
        if (obj instanceof AbstractC2512f) {
            return obj.equals(AbstractC2512f.f9510b);
        }
        if (obj instanceof InterfaceC2486J) {
            return obj == ((InterfaceC2486J) obj).mo10900a();
        }
        return (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
    }

    /* JADX INFO: renamed from: c */
    private static String m10903c(String str) {
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
    static void m10904d(StringBuilder sb, int i7, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m10904d(sb, i7, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m10904d(sb, i7, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        m10901a(i7, sb);
        sb.append(m10903c(str));
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(AbstractC2509d0.m11133c((String) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC2512f) {
            sb.append(": \"");
            sb.append(AbstractC2509d0.m11131a((AbstractC2512f) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC2533t) {
            sb.append(" {");
            m10905e((AbstractC2533t) obj, sb, i7 + 2);
            sb.append("\n");
            m10901a(i7, sb);
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
        m10904d(sb, i8, "key", entry.getKey());
        m10904d(sb, i8, "value", entry.getValue());
        sb.append("\n");
        m10901a(i7, sb);
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
    private static void m10905e(InterfaceC2486J interfaceC2486J, StringBuilder sb, int i7) {
        int i8;
        int i9;
        Method method;
        Method method2;
        Object objM11609z;
        boolean zBooleanValue;
        Method method3;
        Method method4;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = interfaceC2486J.getClass().getDeclaredMethods();
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
                    m10904d(sb, i7, strSubstring.substring(0, strSubstring.length() - 4), AbstractC2533t.m11609z(method4, interfaceC2486J, new Object[0]));
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
                                objM11609z = AbstractC2533t.m11609z(method, interfaceC2486J, new Object[0]);
                                if (method2 == null) {
                                    zBooleanValue = ((Boolean) AbstractC2533t.m11609z(method2, interfaceC2486J, new Object[0])).booleanValue();
                                } else if (m10902b(objM11609z)) {
                                    zBooleanValue = false;
                                } else {
                                    zBooleanValue = true;
                                }
                                if (zBooleanValue) {
                                    m10904d(sb, i7, strSubstring, objM11609z);
                                }
                            }
                        }
                    } else {
                        method = (Method) entry.getValue();
                        method2 = (Method) map.get("has" + strSubstring);
                        if (method != null) {
                            objM11609z = AbstractC2533t.m11609z(method, interfaceC2486J, new Object[0]);
                            if (method2 == null) {
                                zBooleanValue = ((Boolean) AbstractC2533t.m11609z(method2, interfaceC2486J, new Object[0])).booleanValue();
                            } else if (m10902b(objM11609z)) {
                                zBooleanValue = true;
                            } else {
                                zBooleanValue = false;
                            }
                            if (zBooleanValue) {
                                m10904d(sb, i7, strSubstring, objM11609z);
                            }
                        }
                    }
                }
            } else {
                m10904d(sb, i7, strSubstring.substring(0, strSubstring.length() - 3), AbstractC2533t.m11609z(method3, interfaceC2486J, new Object[0]));
            }
            i8 = i9;
        }
        C2515g0 c2515g0 = ((AbstractC2533t) interfaceC2486J).unknownFields;
        if (c2515g0 != null) {
            c2515g0.m11262m(sb, i7);
        }
    }

    /* JADX INFO: renamed from: f */
    static String m10906f(InterfaceC2486J interfaceC2486J, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m10905e(interfaceC2486J, sb, 0);
        return sb.toString();
    }
}
