package p067I1;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;
import p019C1.C0132h;

/* JADX INFO: renamed from: I1.v */
/* JADX INFO: loaded from: classes.dex */
public class C0602v implements InterfaceC0594n {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0594n f2309a;

    /* JADX INFO: renamed from: I1.v$a */
    public static final class a implements InterfaceC0595o {
        @Override // p067I1.InterfaceC0595o
        /* JADX INFO: renamed from: d */
        public InterfaceC0594n mo2557d(C0598r c0598r) {
            return new C0602v(c0598r.m2628d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* JADX INFO: renamed from: I1.v$b */
    public static class b implements InterfaceC0595o {
        @Override // p067I1.InterfaceC0595o
        /* JADX INFO: renamed from: d */
        public InterfaceC0594n mo2557d(C0598r c0598r) {
            return new C0602v(c0598r.m2628d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* JADX INFO: renamed from: I1.v$c */
    public static class c implements InterfaceC0595o {
        @Override // p067I1.InterfaceC0595o
        /* JADX INFO: renamed from: d */
        public InterfaceC0594n mo2557d(C0598r c0598r) {
            return new C0602v(c0598r.m2628d(Uri.class, InputStream.class));
        }
    }

    public C0602v(InterfaceC0594n interfaceC0594n) {
        this.f2309a = interfaceC0594n;
    }

    /* JADX INFO: renamed from: e */
    private static Uri m2644e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return m2645f(str);
        }
        Uri uri = Uri.parse(str);
        return uri.getScheme() == null ? m2645f(str) : uri;
    }

    /* JADX INFO: renamed from: f */
    private static Uri m2645f(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // p067I1.InterfaceC0594n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC0594n.a mo2552a(String str, int i7, int i8, C0132h c0132h) {
        Uri uriM2644e = m2644e(str);
        if (uriM2644e == null || !this.f2309a.mo2553b(uriM2644e)) {
            return null;
        }
        return this.f2309a.mo2552a(uriM2644e, i7, i8, c0132h);
    }

    @Override // p067I1.InterfaceC0594n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo2553b(String str) {
        return true;
    }
}
