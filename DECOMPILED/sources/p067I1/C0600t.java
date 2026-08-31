package p067I1;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import java.util.List;
import p019C1.C0132h;

/* JADX INFO: renamed from: I1.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0600t implements InterfaceC0594n {

    /* JADX INFO: renamed from: a */
    private final Context f2304a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0594n f2305b;

    /* JADX INFO: renamed from: I1.t$a */
    private static final class a implements InterfaceC0595o {

        /* JADX INFO: renamed from: a */
        private final Context f2306a;

        a(Context context) {
            this.f2306a = context;
        }

        @Override // p067I1.InterfaceC0595o
        /* JADX INFO: renamed from: d */
        public InterfaceC0594n mo2557d(C0598r c0598r) {
            return new C0600t(this.f2306a, c0598r.m2628d(Integer.class, AssetFileDescriptor.class));
        }
    }

    /* JADX INFO: renamed from: I1.t$b */
    private static final class b implements InterfaceC0595o {

        /* JADX INFO: renamed from: a */
        private final Context f2307a;

        b(Context context) {
            this.f2307a = context;
        }

        @Override // p067I1.InterfaceC0595o
        /* JADX INFO: renamed from: d */
        public InterfaceC0594n mo2557d(C0598r c0598r) {
            return new C0600t(this.f2307a, c0598r.m2628d(Integer.class, InputStream.class));
        }
    }

    C0600t(Context context, InterfaceC0594n interfaceC0594n) {
        this.f2304a = context.getApplicationContext();
        this.f2305b = interfaceC0594n;
    }

    /* JADX INFO: renamed from: e */
    public static InterfaceC0595o m2637e(Context context) {
        return new a(context);
    }

    /* JADX INFO: renamed from: f */
    public static InterfaceC0595o m2638f(Context context) {
        return new b(context);
    }

    /* JADX INFO: renamed from: g */
    private InterfaceC0594n.a m2639g(Uri uri, int i7, int i8, C0132h c0132h) {
        try {
            int i9 = Integer.parseInt(uri.getPathSegments().get(0));
            if (i9 != 0) {
                return this.f2305b.mo2552a(Integer.valueOf(i9), i7, i8, c0132h);
            }
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri);
            }
            return null;
        } catch (NumberFormatException e7) {
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri, e7);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    private InterfaceC0594n.a m2640h(Uri uri, int i7, int i8, C0132h c0132h) {
        List<String> pathSegments = uri.getPathSegments();
        int identifier = this.f2304a.getResources().getIdentifier(pathSegments.get(1), pathSegments.get(0), this.f2304a.getPackageName());
        if (identifier != 0) {
            return this.f2305b.mo2552a(Integer.valueOf(identifier), i7, i8, c0132h);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri);
        return null;
    }

    @Override // p067I1.InterfaceC0594n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC0594n.a mo2552a(Uri uri, int i7, int i8, C0132h c0132h) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 1) {
            return m2639g(uri, i7, i8, c0132h);
        }
        if (pathSegments.size() == 2) {
            return m2640h(uri, i7, i8, c0132h);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri);
        return null;
    }

    @Override // p067I1.InterfaceC0594n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo2553b(Uri uri) {
        return "android.resource".equals(uri.getScheme()) && this.f2304a.getPackageName().equals(uri.getAuthority());
    }
}
