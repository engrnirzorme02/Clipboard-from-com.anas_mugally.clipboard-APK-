package p067I1;

import android.content.ContentResolver;
import android.net.Uri;
import com.bumptech.glide.load.data.C3216a;
import com.bumptech.glide.load.data.C3224i;
import com.bumptech.glide.load.data.C3229n;
import com.bumptech.glide.load.data.InterfaceC3219d;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p019C1.C0132h;
import p176X1.C1944d;

/* JADX INFO: renamed from: I1.x */
/* JADX INFO: loaded from: classes.dex */
public class C0604x implements InterfaceC0594n {

    /* JADX INFO: renamed from: b */
    private static final Set f2313b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* JADX INFO: renamed from: a */
    private final c f2314a;

    /* JADX INFO: renamed from: I1.x$a */
    public static final class a implements InterfaceC0595o, c {

        /* JADX INFO: renamed from: a */
        private final ContentResolver f2315a;

        /* JADX INFO: renamed from: b */
        private final boolean f2316b;

        public a(ContentResolver contentResolver, boolean z7) {
            this.f2315a = contentResolver;
            this.f2316b = z7;
        }

        @Override // p067I1.C0604x.c
        /* JADX INFO: renamed from: a */
        public InterfaceC3219d mo2652a(Uri uri) {
            return new C3216a(this.f2315a, uri, this.f2316b);
        }

        @Override // p067I1.InterfaceC0595o
        /* JADX INFO: renamed from: d */
        public InterfaceC0594n mo2557d(C0598r c0598r) {
            return new C0604x(this);
        }
    }

    /* JADX INFO: renamed from: I1.x$b */
    public static class b implements InterfaceC0595o, c {

        /* JADX INFO: renamed from: a */
        private final ContentResolver f2317a;

        /* JADX INFO: renamed from: b */
        private final boolean f2318b;

        public b(ContentResolver contentResolver, boolean z7) {
            this.f2317a = contentResolver;
            this.f2318b = z7;
        }

        @Override // p067I1.C0604x.c
        /* JADX INFO: renamed from: a */
        public InterfaceC3219d mo2652a(Uri uri) {
            return new C3224i(this.f2317a, uri, this.f2318b);
        }

        @Override // p067I1.InterfaceC0595o
        /* JADX INFO: renamed from: d */
        public InterfaceC0594n mo2557d(C0598r c0598r) {
            return new C0604x(this);
        }
    }

    /* JADX INFO: renamed from: I1.x$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        InterfaceC3219d mo2652a(Uri uri);
    }

    /* JADX INFO: renamed from: I1.x$d */
    public static class d implements InterfaceC0595o, c {

        /* JADX INFO: renamed from: a */
        private final ContentResolver f2319a;

        /* JADX INFO: renamed from: b */
        private final boolean f2320b;

        public d(ContentResolver contentResolver, boolean z7) {
            this.f2319a = contentResolver;
            this.f2320b = z7;
        }

        @Override // p067I1.C0604x.c
        /* JADX INFO: renamed from: a */
        public InterfaceC3219d mo2652a(Uri uri) {
            return new C3229n(this.f2319a, uri, this.f2320b);
        }

        @Override // p067I1.InterfaceC0595o
        /* JADX INFO: renamed from: d */
        public InterfaceC0594n mo2557d(C0598r c0598r) {
            return new C0604x(this);
        }
    }

    public C0604x(c cVar) {
        this.f2314a = cVar;
    }

    @Override // p067I1.InterfaceC0594n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC0594n.a mo2552a(Uri uri, int i7, int i8, C0132h c0132h) {
        return new InterfaceC0594n.a(new C1944d(uri), this.f2314a.mo2652a(uri));
    }

    @Override // p067I1.InterfaceC0594n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo2553b(Uri uri) {
        return f2313b.contains(uri.getScheme());
    }
}
