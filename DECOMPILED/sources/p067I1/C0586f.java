package p067I1;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.EnumC3207g;
import com.bumptech.glide.load.data.InterfaceC3219d;
import java.io.IOException;
import java.io.InputStream;
import p019C1.C0132h;
import p019C1.EnumC0125a;
import p106N1.AbstractC0943i;
import p106N1.C0946l;
import p176X1.C1944d;

/* JADX INFO: renamed from: I1.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0586f implements InterfaceC0594n {

    /* JADX INFO: renamed from: a */
    private final Context f2231a;

    /* JADX INFO: renamed from: b */
    private final e f2232b;

    /* JADX INFO: renamed from: I1.f$a */
    private static final class a implements InterfaceC0595o, e {

        /* JADX INFO: renamed from: a */
        private final Context f2233a;

        a(Context context) {
            this.f2233a = context;
        }

        @Override // p067I1.C0586f.e
        /* JADX INFO: renamed from: a */
        public Class mo2577a() {
            return AssetFileDescriptor.class;
        }

        @Override // p067I1.InterfaceC0595o
        /* JADX INFO: renamed from: d */
        public InterfaceC0594n mo2557d(C0598r c0598r) {
            return new C0586f(this.f2233a, this);
        }

        @Override // p067I1.C0586f.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo2578b(AssetFileDescriptor assetFileDescriptor) throws IOException {
            assetFileDescriptor.close();
        }

        @Override // p067I1.C0586f.e
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public AssetFileDescriptor mo2579c(Resources.Theme theme, Resources resources, int i7) {
            return resources.openRawResourceFd(i7);
        }
    }

    /* JADX INFO: renamed from: I1.f$b */
    private static final class b implements InterfaceC0595o, e {

        /* JADX INFO: renamed from: a */
        private final Context f2234a;

        b(Context context) {
            this.f2234a = context;
        }

        @Override // p067I1.C0586f.e
        /* JADX INFO: renamed from: a */
        public Class mo2577a() {
            return Drawable.class;
        }

        @Override // p067I1.InterfaceC0595o
        /* JADX INFO: renamed from: d */
        public InterfaceC0594n mo2557d(C0598r c0598r) {
            return new C0586f(this.f2234a, this);
        }

        @Override // p067I1.C0586f.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo2578b(Drawable drawable) {
        }

        @Override // p067I1.C0586f.e
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Drawable mo2579c(Resources.Theme theme, Resources resources, int i7) {
            return AbstractC0943i.m4191a(this.f2234a, i7, theme);
        }
    }

    /* JADX INFO: renamed from: I1.f$c */
    private static final class c implements InterfaceC0595o, e {

        /* JADX INFO: renamed from: a */
        private final Context f2235a;

        c(Context context) {
            this.f2235a = context;
        }

        @Override // p067I1.C0586f.e
        /* JADX INFO: renamed from: a */
        public Class mo2577a() {
            return InputStream.class;
        }

        @Override // p067I1.InterfaceC0595o
        /* JADX INFO: renamed from: d */
        public InterfaceC0594n mo2557d(C0598r c0598r) {
            return new C0586f(this.f2235a, this);
        }

        @Override // p067I1.C0586f.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo2578b(InputStream inputStream) throws IOException {
            inputStream.close();
        }

        @Override // p067I1.C0586f.e
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public InputStream mo2579c(Resources.Theme theme, Resources resources, int i7) {
            return resources.openRawResource(i7);
        }
    }

    /* JADX INFO: renamed from: I1.f$d */
    private static final class d implements InterfaceC3219d {

        /* JADX INFO: renamed from: a */
        private final Resources.Theme f2236a;

        /* JADX INFO: renamed from: b */
        private final Resources f2237b;

        /* JADX INFO: renamed from: c */
        private final e f2238c;

        /* JADX INFO: renamed from: d */
        private final int f2239d;

        /* JADX INFO: renamed from: e */
        private Object f2240e;

        d(Resources.Theme theme, Resources resources, e eVar, int i7) {
            this.f2236a = theme;
            this.f2237b = resources;
            this.f2238c = eVar;
            this.f2239d = i7;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3219d
        /* JADX INFO: renamed from: a */
        public Class mo930a() {
            return this.f2238c.mo2577a();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3219d
        /* JADX INFO: renamed from: b */
        public void mo931b() {
            Object obj = this.f2240e;
            if (obj != null) {
                try {
                    this.f2238c.mo2578b(obj);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3219d
        public void cancel() {
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
                Object objMo2579c = this.f2238c.mo2579c(this.f2236a, this.f2237b, this.f2239d);
                this.f2240e = objMo2579c;
                aVar.mo1314f(objMo2579c);
            } catch (Resources.NotFoundException e7) {
                aVar.mo1313c(e7);
            }
        }
    }

    /* JADX INFO: renamed from: I1.f$e */
    private interface e {
        /* JADX INFO: renamed from: a */
        Class mo2577a();

        /* JADX INFO: renamed from: b */
        void mo2578b(Object obj);

        /* JADX INFO: renamed from: c */
        Object mo2579c(Resources.Theme theme, Resources resources, int i7);
    }

    C0586f(Context context, e eVar) {
        this.f2231a = context.getApplicationContext();
        this.f2232b = eVar;
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC0595o m2572c(Context context) {
        return new a(context);
    }

    /* JADX INFO: renamed from: e */
    public static InterfaceC0595o m2573e(Context context) {
        return new b(context);
    }

    /* JADX INFO: renamed from: g */
    public static InterfaceC0595o m2574g(Context context) {
        return new c(context);
    }

    @Override // p067I1.InterfaceC0594n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceC0594n.a mo2552a(Integer num, int i7, int i8, C0132h c0132h) {
        Resources.Theme theme = (Resources.Theme) c0132h.m600c(C0946l.f3658b);
        return new InterfaceC0594n.a(new C1944d(num), new d(theme, theme != null ? theme.getResources() : this.f2231a.getResources(), this.f2232b, num.intValue()));
    }

    @Override // p067I1.InterfaceC0594n
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean mo2553b(Integer num) {
        return true;
    }
}
