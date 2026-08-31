package p075J1;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.EnumC3207g;
import com.bumptech.glide.load.data.InterfaceC3219d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import p019C1.C0132h;
import p019C1.EnumC0125a;
import p027D1.AbstractC0183c;
import p067I1.C0598r;
import p067I1.InterfaceC0594n;
import p067I1.InterfaceC0595o;
import p176X1.C1944d;

/* JADX INFO: renamed from: J1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0675d implements InterfaceC0594n {

    /* JADX INFO: renamed from: a */
    private final Context f2619a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0594n f2620b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0594n f2621c;

    /* JADX INFO: renamed from: d */
    private final Class f2622d;

    /* JADX INFO: renamed from: J1.d$a */
    private static abstract class a implements InterfaceC0595o {

        /* JADX INFO: renamed from: a */
        private final Context f2623a;

        /* JADX INFO: renamed from: b */
        private final Class f2624b;

        a(Context context, Class cls) {
            this.f2623a = context;
            this.f2624b = cls;
        }

        @Override // p067I1.InterfaceC0595o
        /* JADX INFO: renamed from: d */
        public final InterfaceC0594n mo2557d(C0598r c0598r) {
            return new C0675d(this.f2623a, c0598r.m2628d(File.class, this.f2624b), c0598r.m2628d(Uri.class, this.f2624b), this.f2624b);
        }
    }

    /* JADX INFO: renamed from: J1.d$b */
    public static final class b extends a {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* JADX INFO: renamed from: J1.d$c */
    public static final class c extends a {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* JADX INFO: renamed from: J1.d$d */
    private static final class d implements InterfaceC3219d {

        /* JADX INFO: renamed from: v */
        private static final String[] f2625v = {"_data"};

        /* JADX INFO: renamed from: a */
        private final Context f2626a;

        /* JADX INFO: renamed from: b */
        private final InterfaceC0594n f2627b;

        /* JADX INFO: renamed from: c */
        private final InterfaceC0594n f2628c;

        /* JADX INFO: renamed from: d */
        private final Uri f2629d;

        /* JADX INFO: renamed from: e */
        private final int f2630e;

        /* JADX INFO: renamed from: f */
        private final int f2631f;

        /* JADX INFO: renamed from: r */
        private final C0132h f2632r;

        /* JADX INFO: renamed from: s */
        private final Class f2633s;

        /* JADX INFO: renamed from: t */
        private volatile boolean f2634t;

        /* JADX INFO: renamed from: u */
        private volatile InterfaceC3219d f2635u;

        d(Context context, InterfaceC0594n interfaceC0594n, InterfaceC0594n interfaceC0594n2, Uri uri, int i7, int i8, C0132h c0132h, Class cls) {
            this.f2626a = context.getApplicationContext();
            this.f2627b = interfaceC0594n;
            this.f2628c = interfaceC0594n2;
            this.f2629d = uri;
            this.f2630e = i7;
            this.f2631f = i8;
            this.f2632r = c0132h;
            this.f2633s = cls;
        }

        /* JADX INFO: renamed from: c */
        private InterfaceC0594n.a m3193c() {
            if (Environment.isExternalStorageLegacy()) {
                return this.f2627b.mo2552a(m3196h(this.f2629d), this.f2630e, this.f2631f, this.f2632r);
            }
            if (AbstractC0183c.m918a(this.f2629d)) {
                return this.f2628c.mo2552a(this.f2629d, this.f2630e, this.f2631f, this.f2632r);
            }
            return this.f2628c.mo2552a(m3195g() ? MediaStore.setRequireOriginal(this.f2629d) : this.f2629d, this.f2630e, this.f2631f, this.f2632r);
        }

        /* JADX INFO: renamed from: f */
        private InterfaceC3219d m3194f() {
            InterfaceC0594n.a aVarM3193c = m3193c();
            if (aVarM3193c != null) {
                return aVarM3193c.f2276c;
            }
            return null;
        }

        /* JADX INFO: renamed from: g */
        private boolean m3195g() {
            return this.f2626a.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        /* JADX INFO: renamed from: h */
        private File m3196h(Uri uri) {
            Cursor cursor = null;
            try {
                Cursor cursorQuery = this.f2626a.getContentResolver().query(uri, f2625v, null, null, null);
                if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    cursorQuery.close();
                    return file;
                }
                throw new FileNotFoundException("File path was empty in media store for: " + uri);
            } catch (Throwable th) {
                if (0 == 0) {
                    throw th;
                }
                cursor.close();
                throw th;
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3219d
        /* JADX INFO: renamed from: a */
        public Class mo930a() {
            return this.f2633s;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3219d
        /* JADX INFO: renamed from: b */
        public void mo931b() {
            InterfaceC3219d interfaceC3219d = this.f2635u;
            if (interfaceC3219d != null) {
                interfaceC3219d.mo931b();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3219d
        public void cancel() {
            this.f2634t = true;
            InterfaceC3219d interfaceC3219d = this.f2635u;
            if (interfaceC3219d != null) {
                interfaceC3219d.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3219d
        /* JADX INFO: renamed from: d */
        public EnumC0125a mo932d() {
            return EnumC0125a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3219d
        /* JADX INFO: renamed from: e */
        public void mo933e(EnumC3207g enumC3207g, InterfaceC3219d.a aVar) {
            try {
                InterfaceC3219d interfaceC3219dM3194f = m3194f();
                if (interfaceC3219dM3194f == null) {
                    aVar.mo1313c(new IllegalArgumentException("Failed to build fetcher for: " + this.f2629d));
                    return;
                }
                this.f2635u = interfaceC3219dM3194f;
                if (this.f2634t) {
                    cancel();
                } else {
                    interfaceC3219dM3194f.mo933e(enumC3207g, aVar);
                }
            } catch (FileNotFoundException e7) {
                aVar.mo1313c(e7);
            }
        }
    }

    C0675d(Context context, InterfaceC0594n interfaceC0594n, InterfaceC0594n interfaceC0594n2, Class cls) {
        this.f2619a = context.getApplicationContext();
        this.f2620b = interfaceC0594n;
        this.f2621c = interfaceC0594n2;
        this.f2622d = cls;
    }

    @Override // p067I1.InterfaceC0594n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC0594n.a mo2552a(Uri uri, int i7, int i8, C0132h c0132h) {
        return new InterfaceC0594n.a(new C1944d(uri), new d(this.f2619a, this.f2620b, this.f2621c, uri, i7, i8, c0132h, this.f2622d));
    }

    @Override // p067I1.InterfaceC0594n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo2553b(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && AbstractC0183c.m921d(uri);
    }
}
