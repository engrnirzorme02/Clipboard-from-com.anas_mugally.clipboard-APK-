package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p227d3.C5228d;

/* JADX INFO: renamed from: com.google.android.gms.common.util.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3746a {
    /* JADX INFO: renamed from: a */
    public static byte[] m18142a(Context context, String str) {
        MessageDigest messageDigestM18143b;
        PackageInfo packageInfoM24152f = C5228d.m24155a(context).m24152f(str, 64);
        Signature[] signatureArr = packageInfoM24152f.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (messageDigestM18143b = m18143b("SHA1")) == null) {
            return null;
        }
        return messageDigestM18143b.digest(packageInfoM24152f.signatures[0].toByteArray());
    }

    /* JADX INFO: renamed from: b */
    public static MessageDigest m18143b(String str) {
        for (int i7 = 0; i7 < 2; i7++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str);
                if (messageDigest != null) {
                    return messageDigest;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }
}
