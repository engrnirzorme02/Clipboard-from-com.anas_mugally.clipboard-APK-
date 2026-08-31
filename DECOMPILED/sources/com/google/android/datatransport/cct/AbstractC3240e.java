package com.google.android.datatransport.cct;

/* JADX INFO: renamed from: com.google.android.datatransport.cct.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3240e {
    /* JADX INFO: renamed from: a */
    static String m17163a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i7 = 0; i7 < str.length(); i7++) {
            sb.append(str.charAt(i7));
            if (str2.length() > i7) {
                sb.append(str2.charAt(i7));
            }
        }
        return sb.toString();
    }
}
