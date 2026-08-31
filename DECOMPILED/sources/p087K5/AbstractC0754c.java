package p087K5;

import java.io.UnsupportedEncodingException;
import p072I6.C0651h;

/* JADX INFO: renamed from: K5.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0754c {
    /* JADX INFO: renamed from: a */
    public static String m3541a(String str, String str2) {
        try {
            return "Basic " + C0651h.m3085x((str + ":" + str2).getBytes("ISO-8859-1")).mo3096c();
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }
}
