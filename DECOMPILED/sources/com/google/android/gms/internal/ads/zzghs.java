package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class zzghs {
    public static String zza(String str) {
        return str == null ? "" : str;
    }

    public static String zzb(String str) {
        if (zzghb.zza(str)) {
            return null;
        }
        return str;
    }

    public static boolean zzc(String str) {
        return zzghb.zza(str);
    }

    public static String zzd(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            length = objArr.length;
            if (i8 >= length) {
                break;
            }
            Object obj = objArr[i8];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e7) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
                    sb.append(name);
                    sb.append("@");
                    sb.append(hexString);
                    String string2 = sb.toString();
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(string2), (Throwable) e7);
                    String name2 = e7.getClass().getName();
                    StringBuilder sb2 = new StringBuilder(string2.length() + 8 + name2.length() + 1);
                    sb2.append("<");
                    sb2.append(string2);
                    sb2.append(" threw ");
                    sb2.append(name2);
                    sb2.append(">");
                    string = sb2.toString();
                }
            }
            objArr[i8] = string;
            i8++;
        }
        StringBuilder sb3 = new StringBuilder(str.length() + (length * 16));
        int i9 = 0;
        while (true) {
            length2 = objArr.length;
            if (i7 >= length2 || (iIndexOf = str.indexOf("%s", i9)) == -1) {
                break;
            }
            sb3.append((CharSequence) str, i9, iIndexOf);
            sb3.append(objArr[i7]);
            i7++;
            i9 = iIndexOf + 2;
        }
        sb3.append((CharSequence) str, i9, str.length());
        if (i7 < length2) {
            sb3.append(" [");
            sb3.append(objArr[i7]);
            for (int i10 = i7 + 1; i10 < objArr.length; i10++) {
                sb3.append(", ");
                sb3.append(objArr[i10]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }
}
