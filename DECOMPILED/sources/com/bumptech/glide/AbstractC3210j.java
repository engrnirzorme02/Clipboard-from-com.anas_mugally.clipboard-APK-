package com.bumptech.glide;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.appcompat.app.AbstractC2263x;
import com.bumptech.glide.load.data.C3226k;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import p011B1.InterfaceC0055a;
import p019C1.InterfaceC0134j;
import p043F1.InterfaceC0404b;
import p043F1.InterfaceC0406d;
import p066I0.AbstractC0578a;
import p067I1.C0581a;
import p067I1.C0582b;
import p067I1.C0583c;
import p067I1.C0584d;
import p067I1.C0585e;
import p067I1.C0586f;
import p067I1.C0587g;
import p067I1.C0588h;
import p067I1.C0592l;
import p067I1.C0599s;
import p067I1.C0600t;
import p067I1.C0601u;
import p067I1.C0602v;
import p067I1.C0603w;
import p067I1.C0604x;
import p067I1.C0605y;
import p067I1.InterfaceC0595o;
import p075J1.C0672a;
import p075J1.C0673b;
import p075J1.C0674c;
import p075J1.C0675d;
import p075J1.C0678g;
import p091L1.C0798S;
import p091L1.C0800U;
import p091L1.C0802W;
import p091L1.C0803X;
import p091L1.C0805Z;
import p091L1.C0806a;
import p091L1.C0808b;
import p091L1.C0809b0;
import p091L1.C0810c;
import p091L1.C0816i;
import p091L1.C0818k;
import p091L1.C0822o;
import p091L1.C0824q;
import p091L1.C0827t;
import p099M1.C0884a;
import p106N1.C0942h;
import p106N1.C0946l;
import p106N1.C0947m;
import p113O1.C1110a;
import p120P1.C1184a;
import p120P1.C1186c;
import p120P1.C1187d;
import p120P1.C1191h;
import p120P1.C1193j;
import p127Q1.C1247a;
import p127Q1.C1248b;
import p127Q1.C1249c;
import p127Q1.C1250d;
import p141S1.AbstractC1386a;
import p183Y1.AbstractC2017f;

/* JADX INFO: renamed from: com.bumptech.glide.j */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC3210j {

    /* JADX INFO: renamed from: com.bumptech.glide.j$a */
    class a implements AbstractC2017f.b {

        /* JADX INFO: renamed from: a */
        private boolean f13744a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ComponentCallbacks2C3202b f13745b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ List f13746c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ AbstractC1386a f13747d;

        a(ComponentCallbacks2C3202b componentCallbacks2C3202b, List list, AbstractC1386a abstractC1386a) {
            this.f13745b = componentCallbacks2C3202b;
            this.f13746c = list;
            this.f13747d = abstractC1386a;
        }

        @Override // p183Y1.AbstractC2017f.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3209i get() {
            if (this.f13744a) {
                throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
            }
            AbstractC0578a.m2543a("Glide registry");
            this.f13744a = true;
            try {
                return AbstractC3210j.m17043a(this.f13745b, this.f13746c, this.f13747d);
            } finally {
                this.f13744a = false;
                AbstractC0578a.m2544b();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    static C3209i m17043a(ComponentCallbacks2C3202b componentCallbacks2C3202b, List list, AbstractC1386a abstractC1386a) {
        InterfaceC0406d interfaceC0406dM16998f = componentCallbacks2C3202b.m16998f();
        InterfaceC0404b interfaceC0404bM16997e = componentCallbacks2C3202b.m16997e();
        Context applicationContext = componentCallbacks2C3202b.m17001i().getApplicationContext();
        C3205e c3205eM17017g = componentCallbacks2C3202b.m17001i().m17017g();
        C3209i c3209i = new C3209i();
        m17044b(applicationContext, c3209i, interfaceC0406dM16998f, interfaceC0404bM16997e, c3205eM17017g);
        m17045c(applicationContext, componentCallbacks2C3202b, c3209i, list, abstractC1386a);
        return c3209i;
    }

    /* JADX INFO: renamed from: b */
    private static void m17044b(Context context, C3209i c3209i, InterfaceC0406d interfaceC0406d, InterfaceC0404b interfaceC0404b, C3205e c3205e) {
        InterfaceC0134j c0816i;
        InterfaceC0134j c0803x;
        C3209i c3209i2;
        c3209i.m17039o(new C0822o());
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 27) {
            c3209i.m17039o(new C0827t());
        }
        Resources resources = context.getResources();
        List listM17031g = c3209i.m17031g();
        C1184a c1184a = new C1184a(context, listM17031g, interfaceC0406d, interfaceC0404b);
        InterfaceC0134j interfaceC0134jM3786m = C0809b0.m3786m(interfaceC0406d);
        C0824q c0824q = new C0824q(c3209i.m17031g(), resources.getDisplayMetrics(), interfaceC0406d, interfaceC0404b);
        if (i7 < 28 || !c3205e.m17020a(C3203c.b.class)) {
            c0816i = new C0816i(c0824q);
            c0803x = new C0803X(c0824q, interfaceC0404b);
        } else {
            c0803x = new C0798S();
            c0816i = new C0818k();
        }
        if (i7 >= 28) {
            c3209i.m17030e("Animation", InputStream.class, Drawable.class, C0942h.m4182f(listM17031g, interfaceC0404b));
            c3209i.m17030e("Animation", ByteBuffer.class, Drawable.class, C0942h.m4180a(listM17031g, interfaceC0404b));
        }
        C0946l c0946l = new C0946l(context);
        C0810c c0810c = new C0810c(interfaceC0404b);
        C1247a c1247a = new C1247a();
        C1250d c1250d = new C1250d();
        ContentResolver contentResolver = context.getContentResolver();
        c3209i.m17026a(ByteBuffer.class, new C0583c()).m17026a(InputStream.class, new C0601u(interfaceC0404b)).m17030e("Bitmap", ByteBuffer.class, Bitmap.class, c0816i).m17030e("Bitmap", InputStream.class, Bitmap.class, c0803x);
        if (ParcelFileDescriptorRewinder.m17102c()) {
            c3209i.m17030e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new C0800U(c0824q));
        }
        c3209i.m17030e("Bitmap", AssetFileDescriptor.class, Bitmap.class, C0809b0.m3776c(interfaceC0406d));
        c3209i.m17030e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, interfaceC0134jM3786m).m17029d(Bitmap.class, Bitmap.class, C0603w.a.m2649a()).m17030e("Bitmap", Bitmap.class, Bitmap.class, new C0805Z()).m17027b(Bitmap.class, c0810c).m17030e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C0806a(resources, c0816i)).m17030e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C0806a(resources, c0803x)).m17030e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C0806a(resources, interfaceC0134jM3786m)).m17027b(BitmapDrawable.class, new C0808b(interfaceC0406d, c0810c)).m17030e("Animation", InputStream.class, C1186c.class, new C1193j(listM17031g, c1184a, interfaceC0404b)).m17030e("Animation", ByteBuffer.class, C1186c.class, c1184a).m17027b(C1186c.class, new C1187d()).m17029d(InterfaceC0055a.class, InterfaceC0055a.class, C0603w.a.m2649a()).m17030e("Bitmap", InterfaceC0055a.class, Bitmap.class, new C1191h(interfaceC0406d)).m17028c(Uri.class, Drawable.class, c0946l).m17028c(Uri.class, Bitmap.class, new C0802W(c0946l, interfaceC0406d)).m17040p(new C0884a.a()).m17029d(File.class, ByteBuffer.class, new C0584d.b()).m17029d(File.class, InputStream.class, new C0587g.e()).m17028c(File.class, File.class, new C1110a()).m17029d(File.class, ParcelFileDescriptor.class, new C0587g.b()).m17029d(File.class, File.class, C0603w.a.m2649a()).m17040p(new C3226k.a(interfaceC0404b));
        if (ParcelFileDescriptorRewinder.m17102c()) {
            c3209i2 = c3209i;
            c3209i2.m17040p(new ParcelFileDescriptorRewinder.C3215a());
        } else {
            c3209i2 = c3209i;
        }
        InterfaceC0595o interfaceC0595oM2574g = C0586f.m2574g(context);
        InterfaceC0595o interfaceC0595oM2572c = C0586f.m2572c(context);
        InterfaceC0595o interfaceC0595oM2573e = C0586f.m2573e(context);
        Class cls = Integer.TYPE;
        c3209i2.m17029d(cls, InputStream.class, interfaceC0595oM2574g).m17029d(Integer.class, InputStream.class, interfaceC0595oM2574g).m17029d(cls, AssetFileDescriptor.class, interfaceC0595oM2572c).m17029d(Integer.class, AssetFileDescriptor.class, interfaceC0595oM2572c).m17029d(cls, Drawable.class, interfaceC0595oM2573e).m17029d(Integer.class, Drawable.class, interfaceC0595oM2573e).m17029d(Uri.class, InputStream.class, C0600t.m2638f(context)).m17029d(Uri.class, AssetFileDescriptor.class, C0600t.m2637e(context));
        C0599s.c cVar = new C0599s.c(resources);
        C0599s.a aVar = new C0599s.a(resources);
        C0599s.b bVar = new C0599s.b(resources);
        c3209i2.m17029d(Integer.class, Uri.class, cVar).m17029d(cls, Uri.class, cVar).m17029d(Integer.class, AssetFileDescriptor.class, aVar).m17029d(cls, AssetFileDescriptor.class, aVar).m17029d(Integer.class, InputStream.class, bVar).m17029d(cls, InputStream.class, bVar);
        c3209i2.m17029d(String.class, InputStream.class, new C0585e.c()).m17029d(Uri.class, InputStream.class, new C0585e.c()).m17029d(String.class, InputStream.class, new C0602v.c()).m17029d(String.class, ParcelFileDescriptor.class, new C0602v.b()).m17029d(String.class, AssetFileDescriptor.class, new C0602v.a()).m17029d(Uri.class, InputStream.class, new C0581a.c(context.getAssets())).m17029d(Uri.class, AssetFileDescriptor.class, new C0581a.b(context.getAssets())).m17029d(Uri.class, InputStream.class, new C0673b.a(context)).m17029d(Uri.class, InputStream.class, new C0674c.a(context));
        if (i7 >= 29) {
            c3209i2.m17029d(Uri.class, InputStream.class, new C0675d.c(context));
            c3209i2.m17029d(Uri.class, ParcelFileDescriptor.class, new C0675d.b(context));
        }
        boolean zM17020a = c3205e.m17020a(C3203c.e.class);
        c3209i2.m17029d(Uri.class, InputStream.class, new C0604x.d(contentResolver, zM17020a)).m17029d(Uri.class, ParcelFileDescriptor.class, new C0604x.b(contentResolver, zM17020a)).m17029d(Uri.class, AssetFileDescriptor.class, new C0604x.a(contentResolver, zM17020a)).m17029d(Uri.class, InputStream.class, new C0605y.a()).m17029d(URL.class, InputStream.class, new C0678g.a()).m17029d(Uri.class, File.class, new C0592l.a(context)).m17029d(C0588h.class, InputStream.class, new C0672a.a()).m17029d(byte[].class, ByteBuffer.class, new C0582b.a()).m17029d(byte[].class, InputStream.class, new C0582b.d()).m17029d(Uri.class, Uri.class, C0603w.a.m2649a()).m17029d(Drawable.class, Drawable.class, C0603w.a.m2649a()).m17028c(Drawable.class, Drawable.class, new C0947m()).m17041q(Bitmap.class, BitmapDrawable.class, new C1248b(resources)).m17041q(Bitmap.class, byte[].class, c1247a).m17041q(Drawable.class, byte[].class, new C1249c(interfaceC0406d, c1247a, c1250d)).m17041q(C1186c.class, byte[].class, c1250d);
        InterfaceC0134j interfaceC0134jM3777d = C0809b0.m3777d(interfaceC0406d);
        c3209i2.m17028c(ByteBuffer.class, Bitmap.class, interfaceC0134jM3777d);
        c3209i2.m17028c(ByteBuffer.class, BitmapDrawable.class, new C0806a(resources, interfaceC0134jM3777d));
    }

    /* JADX INFO: renamed from: c */
    private static void m17045c(Context context, ComponentCallbacks2C3202b componentCallbacks2C3202b, C3209i c3209i, List list, AbstractC1386a abstractC1386a) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            AbstractC2263x.m9328a(it.next());
            throw null;
        }
        if (abstractC1386a != null) {
            abstractC1386a.m5961a(context, componentCallbacks2C3202b, c3209i);
        }
    }

    /* JADX INFO: renamed from: d */
    static AbstractC2017f.b m17046d(ComponentCallbacks2C3202b componentCallbacks2C3202b, List list, AbstractC1386a abstractC1386a) {
        return new a(componentCallbacks2C3202b, list, abstractC1386a);
    }
}
