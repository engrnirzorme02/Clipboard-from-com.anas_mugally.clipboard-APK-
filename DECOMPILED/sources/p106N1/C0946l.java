package p106N1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;
import p019C1.C0131g;
import p019C1.C0132h;
import p019C1.InterfaceC0134j;
import p035E1.InterfaceC0301v;
import p183Y1.AbstractC2022k;

/* JADX INFO: renamed from: N1.l */
/* JADX INFO: loaded from: classes.dex */
public class C0946l implements InterfaceC0134j {

    /* JADX INFO: renamed from: b */
    public static final C0131g f3658b = C0131g.m594e("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");

    /* JADX INFO: renamed from: a */
    private final Context f3659a;

    public C0946l(Context context) {
        this.f3659a = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: d */
    private Context m4198d(Uri uri, String str) {
        if (str.equals(this.f3659a.getPackageName())) {
            return this.f3659a;
        }
        try {
            return this.f3659a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e7) {
            if (str.contains(this.f3659a.getPackageName())) {
                return this.f3659a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e7);
        }
    }

    /* JADX INFO: renamed from: e */
    private int m4199e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e7) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e7);
        }
    }

    /* JADX INFO: renamed from: f */
    private int m4200f(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    /* JADX INFO: renamed from: g */
    private int m4201g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return m4200f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return m4199e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    @Override // p019C1.InterfaceC0134j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC0301v mo605a(Uri uri, int i7, int i8, C0132h c0132h) {
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            Context contextM4198d = m4198d(uri, authority);
            int iM4201g = m4201g(contextM4198d, uri);
            Resources.Theme theme = ((String) AbstractC2022k.m8408e(authority)).equals(this.f3659a.getPackageName()) ? (Resources.Theme) c0132h.m600c(f3658b) : null;
            return C0945k.m4197f(theme == null ? AbstractC0943i.m4192b(this.f3659a, contextM4198d, iM4201g) : AbstractC0943i.m4191a(this.f3659a, iM4201g, theme));
        }
        throw new IllegalStateException("Package name for " + uri + " is null or empty");
    }

    @Override // p019C1.InterfaceC0134j
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean mo606b(Uri uri, C0132h c0132h) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("android.resource");
    }
}
