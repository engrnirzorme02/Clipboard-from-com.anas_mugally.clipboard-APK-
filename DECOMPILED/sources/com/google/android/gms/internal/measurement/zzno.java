package com.google.android.gms.internal.measurement;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
final class zzno {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String zza(zznm zznmVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zzc(zznmVar, sb, 0);
        return sb.toString();
    }

    static void zzb(StringBuilder sb, int i7, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb, i7, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb, i7, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        zzd(i7, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i8 = 1; i8 < str.length(); i8++) {
                char cCharAt = str.charAt(i8);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            zzlh zzlhVar = zzlh.zzb;
            sb.append(zzog.zza(new zzlg(((String) obj).getBytes(zzmp.zza))));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzlh) {
            sb.append(": \"");
            sb.append(zzog.zza((zzlh) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzmf) {
            sb.append(" {");
            zzc((zzmf) obj, sb, i7 + 2);
            sb.append("\n");
            zzd(i7, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i9 = i7 + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        zzb(sb, i9, "key", entry.getKey());
        zzb(sb, i9, "value", entry.getValue());
        sb.append("\n");
        zzd(i7, sb);
        sb.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01fa  */
    private static void zzc(zznm zznmVar, StringBuilder sb, int i7) {
        int i8;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zznmVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i9 = 0;
        while (true) {
            i8 = 3;
            if (i9 >= length) {
                break;
            }
            Method method3 = declaredMethods[i9];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i9++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i8);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zzb(sb, i7, strSubstring.substring(0, strSubstring.length() - 4), zzmf.zzcr(method2, zznmVar, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb, i7, strSubstring.substring(0, strSubstring.length() - 3), zzmf.zzcr(method, zznmVar, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objZzcr = zzmf.zzcr(method4, zznmVar, new Object[0]);
                    if (method5 == null) {
                        if (objZzcr instanceof Boolean) {
                            if (((Boolean) objZzcr).booleanValue()) {
                                zzb(sb, i7, strSubstring, objZzcr);
                            }
                        } else if (objZzcr instanceof Integer) {
                            if (((Integer) objZzcr).intValue() != 0) {
                                zzb(sb, i7, strSubstring, objZzcr);
                            }
                        } else if (objZzcr instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objZzcr).floatValue()) != 0) {
                                zzb(sb, i7, strSubstring, objZzcr);
                            }
                        } else if (!(objZzcr instanceof Double)) {
                            if (objZzcr instanceof String) {
                                zEquals = objZzcr.equals("");
                            } else if (objZzcr instanceof zzlh) {
                                zEquals = objZzcr.equals(zzlh.zzb);
                            } else if (objZzcr instanceof zznm) {
                                if (objZzcr != ((zznm) objZzcr).zzcE()) {
                                    zzb(sb, i7, strSubstring, objZzcr);
                                }
                            } else if (!(objZzcr instanceof Enum) || ((Enum) objZzcr).ordinal() != 0) {
                                zzb(sb, i7, strSubstring, objZzcr);
                            }
                            if (!zEquals) {
                                zzb(sb, i7, strSubstring, objZzcr);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objZzcr).doubleValue()) != 0) {
                            zzb(sb, i7, strSubstring, objZzcr);
                        }
                    } else if (((Boolean) zzmf.zzcr(method5, zznmVar, new Object[0])).booleanValue()) {
                        zzb(sb, i7, strSubstring, objZzcr);
                    }
                }
            }
            i8 = 3;
        }
        if (zznmVar instanceof zzmc) {
            Iterator itZzc = ((zzmc) zznmVar).zzb.zzc();
            if (itZzc.hasNext()) {
                throw null;
            }
        }
        zzoj zzojVar = ((zzmf) zznmVar).zzc;
        if (zzojVar != null) {
            zzojVar.zzj(sb, i7);
        }
    }

    private static void zzd(int i7, StringBuilder sb) {
        while (i7 > 0) {
            int i8 = 80;
            if (i7 <= 80) {
                i8 = i7;
            }
            sb.append(zza, 0, i8);
            i7 -= i8;
        }
    }
}
