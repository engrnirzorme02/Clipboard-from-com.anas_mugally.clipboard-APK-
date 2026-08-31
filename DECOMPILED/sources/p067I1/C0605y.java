package p067I1;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p019C1.C0132h;

/* JADX INFO: renamed from: I1.y */
/* JADX INFO: loaded from: classes.dex */
public class C0605y implements InterfaceC0594n {

    /* JADX INFO: renamed from: b */
    private static final Set f2321b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* JADX INFO: renamed from: a */
    private final InterfaceC0594n f2322a;

    /* JADX INFO: renamed from: I1.y$a */
    public static class a implements InterfaceC0595o {
        @Override // p067I1.InterfaceC0595o
        /* JADX INFO: renamed from: d */
        public InterfaceC0594n mo2557d(C0598r c0598r) {
            return new C0605y(c0598r.m2628d(C0588h.class, InputStream.class));
        }
    }

    public C0605y(InterfaceC0594n interfaceC0594n) {
        this.f2322a = interfaceC0594n;
    }

    @Override // p067I1.InterfaceC0594n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC0594n.a mo2552a(Uri uri, int i7, int i8, C0132h c0132h) {
        return this.f2322a.mo2552a(new C0588h(uri.toString()), i7, i8, c0132h);
    }

    @Override // p067I1.InterfaceC0594n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo2553b(Uri uri) {
        return f2321b.contains(uri.getScheme());
    }
}
