package com.google.android.gms.internal.ads;

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
final class zzhju {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String zza(zzhjs zzhjsVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zzc(zzhjsVar, sb, 0);
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
            sb.append(zzhkt.zza(zzhhb.zzs((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzhhb) {
            sb.append(": \"");
            sb.append(zzhkt.zza((zzhhb) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzhih) {
            sb.append(" {");
            zzc((zzhih) obj, sb, i7 + 2);
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
    private static void zzc(zzhjs zzhjsVar, StringBuilder sb, int i7) {
        int i8;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzhjsVar.getClass().getDeclaredMethods();
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
                zzb(sb, i7, strSubstring.substring(0, strSubstring.length() - 4), zzhih.zzbB(method2, zzhjsVar, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb, i7, strSubstring.substring(0, strSubstring.length() - 3), zzhih.zzbB(method, zzhjsVar, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objZzbB = zzhih.zzbB(method4, zzhjsVar, new Object[0]);
                    if (method5 == null) {
                        if (objZzbB instanceof Boolean) {
                            if (((Boolean) objZzbB).booleanValue()) {
                                zzb(sb, i7, strSubstring, objZzbB);
                            }
                        } else if (objZzbB instanceof Integer) {
                            if (((Integer) objZzbB).intValue() != 0) {
                                zzb(sb, i7, strSubstring, objZzbB);
                            }
                        } else if (objZzbB instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objZzbB).floatValue()) != 0) {
                                zzb(sb, i7, strSubstring, objZzbB);
                            }
                        } else if (!(objZzbB instanceof Double)) {
                            if (objZzbB instanceof String) {
                                zEquals = objZzbB.equals("");
                            } else if (objZzbB instanceof zzhhb) {
                                zEquals = objZzbB.equals(zzhhb.zzb);
                            } else if (objZzbB instanceof zzhjs) {
                                if (objZzbB != ((zzhjs) objZzbB).zzbw()) {
                                    zzb(sb, i7, strSubstring, objZzbB);
                                }
                            } else if (!(objZzbB instanceof Enum) || ((Enum) objZzbB).ordinal() != 0) {
                                zzb(sb, i7, strSubstring, objZzbB);
                            }
                            if (!zEquals) {
                                zzb(sb, i7, strSubstring, objZzbB);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objZzbB).doubleValue()) != 0) {
                            zzb(sb, i7, strSubstring, objZzbB);
                        }
                    } else if (((Boolean) zzhih.zzbB(method5, zzhjsVar, new Object[0])).booleanValue()) {
                        zzb(sb, i7, strSubstring, objZzbB);
                    }
                }
            }
            i8 = 3;
        }
        if (zzhjsVar instanceof zzhid) {
            Iterator itZzc = ((zzhid) zzhjsVar).zza.zzc();
            while (itZzc.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itZzc.next();
                int i10 = ((zzhie) entry2.getKey()).zza;
                StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 2);
                sb2.append("[");
                sb2.append(i10);
                sb2.append("]");
                zzb(sb, i7, sb2.toString(), entry2.getValue());
            }
        }
        zzhkw zzhkwVar = ((zzhih) zzhjsVar).zzt;
        if (zzhkwVar != null) {
            zzhkwVar.zzj(sb, i7);
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
