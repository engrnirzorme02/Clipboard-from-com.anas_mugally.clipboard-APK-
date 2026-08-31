package p067I1;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import p019C1.C0132h;

/* JADX INFO: renamed from: I1.s */
/* JADX INFO: loaded from: classes.dex */
public class C0599s implements InterfaceC0594n {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0594n f2299a;

    /* JADX INFO: renamed from: b */
    private final Resources f2300b;

    /* JADX INFO: renamed from: I1.s$a */
    public static final class a implements InterfaceC0595o {

        /* JADX INFO: renamed from: a */
        private final Resources f2301a;

        public a(Resources resources) {
            this.f2301a = resources;
        }

        @Override // p067I1.InterfaceC0595o
        /* JADX INFO: renamed from: d */
        public InterfaceC0594n mo2557d(C0598r c0598r) {
            return new C0599s(this.f2301a, c0598r.m2628d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* JADX INFO: renamed from: I1.s$b */
    public static class b implements InterfaceC0595o {

        /* JADX INFO: renamed from: a */
        private final Resources f2302a;

        public b(Resources resources) {
            this.f2302a = resources;
        }

        @Override // p067I1.InterfaceC0595o
        /* JADX INFO: renamed from: d */
        public InterfaceC0594n mo2557d(C0598r c0598r) {
            return new C0599s(this.f2302a, c0598r.m2628d(Uri.class, InputStream.class));
        }
    }

    /* JADX INFO: renamed from: I1.s$c */
    public static class c implements InterfaceC0595o {

        /* JADX INFO: renamed from: a */
        private final Resources f2303a;

        public c(Resources resources) {
            this.f2303a = resources;
        }

        @Override // p067I1.InterfaceC0595o
        /* JADX INFO: renamed from: d */
        public InterfaceC0594n mo2557d(C0598r c0598r) {
            return new C0599s(this.f2303a, C0603w.m2648c());
        }
    }

    public C0599s(Resources resources, InterfaceC0594n interfaceC0594n) {
        this.f2300b = resources;
        this.f2299a = interfaceC0594n;
    }

    /* JADX INFO: renamed from: d */
    private Uri m2634d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f2300b.getResourcePackageName(num.intValue()) + '/' + num);
        } catch (Resources.NotFoundException e7) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Log.w("ResourceLoader", "Received invalid resource id: " + num, e7);
            return null;
        }
    }

    @Override // p067I1.InterfaceC0594n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC0594n.a mo2552a(Integer num, int i7, int i8, C0132h c0132h) {
        Uri uriM2634d = m2634d(num);
        if (uriM2634d == null) {
            return null;
        }
        return this.f2299a.mo2552a(uriM2634d, i7, i8, c0132h);
    }

    @Override // p067I1.InterfaceC0594n
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean mo2553b(Integer num) {
        return true;
    }
}
