package p067I1;

import android.content.res.AssetManager;
import android.net.Uri;
import com.bumptech.glide.load.data.C3223h;
import com.bumptech.glide.load.data.C3228m;
import com.bumptech.glide.load.data.InterfaceC3219d;
import p019C1.C0132h;
import p176X1.C1944d;

/* JADX INFO: renamed from: I1.a */
/* JADX INFO: loaded from: classes.dex */
public class C0581a implements InterfaceC0594n {

    /* JADX INFO: renamed from: c */
    private static final int f2214c = 22;

    /* JADX INFO: renamed from: a */
    private final AssetManager f2215a;

    /* JADX INFO: renamed from: b */
    private final a f2216b;

    /* JADX INFO: renamed from: I1.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        InterfaceC3219d mo2556a(AssetManager assetManager, String str);
    }

    /* JADX INFO: renamed from: I1.a$b */
    public static class b implements InterfaceC0595o, a {

        /* JADX INFO: renamed from: a */
        private final AssetManager f2217a;

        public b(AssetManager assetManager) {
            this.f2217a = assetManager;
        }

        @Override // p067I1.C0581a.a
        /* JADX INFO: renamed from: a */
        public InterfaceC3219d mo2556a(AssetManager assetManager, String str) {
            return new C3223h(assetManager, str);
        }

        @Override // p067I1.InterfaceC0595o
        /* JADX INFO: renamed from: d */
        public InterfaceC0594n mo2557d(C0598r c0598r) {
            return new C0581a(this.f2217a, this);
        }
    }

    /* JADX INFO: renamed from: I1.a$c */
    public static class c implements InterfaceC0595o, a {

        /* JADX INFO: renamed from: a */
        private final AssetManager f2218a;

        public c(AssetManager assetManager) {
            this.f2218a = assetManager;
        }

        @Override // p067I1.C0581a.a
        /* JADX INFO: renamed from: a */
        public InterfaceC3219d mo2556a(AssetManager assetManager, String str) {
            return new C3228m(assetManager, str);
        }

        @Override // p067I1.InterfaceC0595o
        /* JADX INFO: renamed from: d */
        public InterfaceC0594n mo2557d(C0598r c0598r) {
            return new C0581a(this.f2218a, this);
        }
    }

    public C0581a(AssetManager assetManager, a aVar) {
        this.f2215a = assetManager;
        this.f2216b = aVar;
    }

    @Override // p067I1.InterfaceC0594n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC0594n.a mo2552a(Uri uri, int i7, int i8, C0132h c0132h) {
        return new InterfaceC0594n.a(new C1944d(uri), this.f2216b.mo2556a(this.f2215a, uri.toString().substring(f2214c)));
    }

    @Override // p067I1.InterfaceC0594n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo2553b(Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
