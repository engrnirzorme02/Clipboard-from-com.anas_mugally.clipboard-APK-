package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.InterfaceC3318a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamic.InterfaceC3772a;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbib;
import com.google.android.gms.internal.ads.zzbid;
import com.google.android.gms.internal.ads.zzbsp;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzcek;
import com.google.android.gms.internal.ads.zzcwf;
import com.google.android.gms.internal.ads.zzddz;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;
import p380w2.C7343l;
import p380w2.C7351t;
import p396y2.C7524l;
import p396y2.InterfaceC7516d;
import p396y2.InterfaceC7536x;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes.dex */
public final class AdOverlayInfoParcel extends AbstractC1945a implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new C3417a();

    /* JADX INFO: renamed from: J */
    private static final AtomicLong f14132J = new AtomicLong(0);

    /* JADX INFO: renamed from: K */
    private static final ConcurrentHashMap f14133K = new ConcurrentHashMap();

    /* JADX INFO: renamed from: A */
    public final zzbib f14134A;

    /* JADX INFO: renamed from: B */
    public final String f14135B;

    /* JADX INFO: renamed from: C */
    public final String f14136C;

    /* JADX INFO: renamed from: D */
    public final String f14137D;

    /* JADX INFO: renamed from: E */
    public final zzcwf f14138E;

    /* JADX INFO: renamed from: F */
    public final zzddz f14139F;

    /* JADX INFO: renamed from: G */
    public final zzbsp f14140G;

    /* JADX INFO: renamed from: H */
    public final boolean f14141H;

    /* JADX INFO: renamed from: I */
    public final long f14142I;

    /* JADX INFO: renamed from: a */
    public final C7524l f14143a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC3318a f14144b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC7536x f14145c;

    /* JADX INFO: renamed from: d */
    public final zzcek f14146d;

    /* JADX INFO: renamed from: e */
    public final zzbid f14147e;

    /* JADX INFO: renamed from: f */
    public final String f14148f;

    /* JADX INFO: renamed from: r */
    public final boolean f14149r;

    /* JADX INFO: renamed from: s */
    public final String f14150s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC7516d f14151t;

    /* JADX INFO: renamed from: u */
    public final int f14152u;

    /* JADX INFO: renamed from: v */
    public final int f14153v;

    /* JADX INFO: renamed from: w */
    public final String f14154w;

    /* JADX INFO: renamed from: x */
    public final C7584a f14155x;

    /* JADX INFO: renamed from: y */
    public final String f14156y;

    /* JADX INFO: renamed from: z */
    public final C7343l f14157z;

    public AdOverlayInfoParcel(InterfaceC3318a interfaceC3318a, InterfaceC7536x interfaceC7536x, zzbib zzbibVar, zzbid zzbidVar, InterfaceC7516d interfaceC7516d, zzcek zzcekVar, boolean z7, int i7, String str, C7584a c7584a, zzddz zzddzVar, zzbsp zzbspVar, boolean z8) {
        this.f14143a = null;
        this.f14144b = interfaceC3318a;
        this.f14145c = interfaceC7536x;
        this.f14146d = zzcekVar;
        this.f14134A = zzbibVar;
        this.f14147e = zzbidVar;
        this.f14148f = null;
        this.f14149r = z7;
        this.f14150s = null;
        this.f14151t = interfaceC7516d;
        this.f14152u = i7;
        this.f14153v = 3;
        this.f14154w = str;
        this.f14155x = c7584a;
        this.f14156y = null;
        this.f14157z = null;
        this.f14135B = null;
        this.f14136C = null;
        this.f14137D = null;
        this.f14138E = null;
        this.f14139F = zzddzVar;
        this.f14140G = zzbspVar;
        this.f14141H = z8;
        this.f14142I = f14132J.getAndIncrement();
    }

    /* JADX INFO: renamed from: T */
    public static AdOverlayInfoParcel m17364T(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception e7) {
            if (!((Boolean) C3250D.m17200c().zzd(zzbci.zznL)).booleanValue()) {
                return null;
            }
            C7351t.m32354l().zzg(e7, "AdOverlayInfoParcel.getFromIntent");
            return null;
        }
    }

    /* JADX INFO: renamed from: V */
    private static final IBinder m17366V(Object obj) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zznL)).booleanValue()) {
            return null;
        }
        return BinderC3773b.m18221N0(obj).asBinder();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8042C(parcel, 2, this.f14143a, i7, false);
        InterfaceC3318a interfaceC3318a = this.f14144b;
        AbstractC1947c.m8071s(parcel, 3, m17366V(interfaceC3318a), false);
        InterfaceC7536x interfaceC7536x = this.f14145c;
        AbstractC1947c.m8071s(parcel, 4, m17366V(interfaceC7536x), false);
        zzcek zzcekVar = this.f14146d;
        AbstractC1947c.m8071s(parcel, 5, m17366V(zzcekVar), false);
        zzbid zzbidVar = this.f14147e;
        AbstractC1947c.m8071s(parcel, 6, m17366V(zzbidVar), false);
        AbstractC1947c.m8044E(parcel, 7, this.f14148f, false);
        AbstractC1947c.m8059g(parcel, 8, this.f14149r);
        AbstractC1947c.m8044E(parcel, 9, this.f14150s, false);
        InterfaceC7516d interfaceC7516d = this.f14151t;
        AbstractC1947c.m8071s(parcel, 10, m17366V(interfaceC7516d), false);
        AbstractC1947c.m8072t(parcel, 11, this.f14152u);
        AbstractC1947c.m8072t(parcel, 12, this.f14153v);
        AbstractC1947c.m8044E(parcel, 13, this.f14154w, false);
        AbstractC1947c.m8042C(parcel, 14, this.f14155x, i7, false);
        AbstractC1947c.m8044E(parcel, 16, this.f14156y, false);
        AbstractC1947c.m8042C(parcel, 17, this.f14157z, i7, false);
        zzbib zzbibVar = this.f14134A;
        AbstractC1947c.m8071s(parcel, 18, m17366V(zzbibVar), false);
        AbstractC1947c.m8044E(parcel, 19, this.f14135B, false);
        AbstractC1947c.m8044E(parcel, 24, this.f14136C, false);
        AbstractC1947c.m8044E(parcel, 25, this.f14137D, false);
        zzcwf zzcwfVar = this.f14138E;
        AbstractC1947c.m8071s(parcel, 26, m17366V(zzcwfVar), false);
        zzddz zzddzVar = this.f14139F;
        AbstractC1947c.m8071s(parcel, 27, m17366V(zzddzVar), false);
        zzbsp zzbspVar = this.f14140G;
        AbstractC1947c.m8071s(parcel, 28, m17366V(zzbspVar), false);
        AbstractC1947c.m8059g(parcel, 29, this.f14141H);
        long j7 = this.f14142I;
        AbstractC1947c.m8076x(parcel, 30, j7);
        AbstractC1947c.m8054b(parcel, iM8053a);
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zznL)).booleanValue()) {
            f14133K.put(Long.valueOf(j7), new C3418b(interfaceC3318a, interfaceC7536x, zzcekVar, zzbibVar, zzbidVar, interfaceC7516d, zzcwfVar, zzddzVar, zzbspVar, zzbzh.zzd.schedule(new CallableC3419c(j7), ((Integer) C3250D.m17200c().zzd(zzbci.zznN)).intValue(), TimeUnit.SECONDS)));
        }
    }

    public AdOverlayInfoParcel(InterfaceC3318a interfaceC3318a, InterfaceC7536x interfaceC7536x, zzbib zzbibVar, zzbid zzbidVar, InterfaceC7516d interfaceC7516d, zzcek zzcekVar, boolean z7, int i7, String str, String str2, C7584a c7584a, zzddz zzddzVar, zzbsp zzbspVar) {
        this.f14143a = null;
        this.f14144b = interfaceC3318a;
        this.f14145c = interfaceC7536x;
        this.f14146d = zzcekVar;
        this.f14134A = zzbibVar;
        this.f14147e = zzbidVar;
        this.f14148f = str2;
        this.f14149r = z7;
        this.f14150s = str;
        this.f14151t = interfaceC7516d;
        this.f14152u = i7;
        this.f14153v = 3;
        this.f14154w = null;
        this.f14155x = c7584a;
        this.f14156y = null;
        this.f14157z = null;
        this.f14135B = null;
        this.f14136C = null;
        this.f14137D = null;
        this.f14138E = null;
        this.f14139F = zzddzVar;
        this.f14140G = zzbspVar;
        this.f14141H = false;
        this.f14142I = f14132J.getAndIncrement();
    }

    public AdOverlayInfoParcel(InterfaceC3318a interfaceC3318a, InterfaceC7536x interfaceC7536x, InterfaceC7516d interfaceC7516d, zzcek zzcekVar, int i7, C7584a c7584a, String str, C7343l c7343l, String str2, String str3, String str4, zzcwf zzcwfVar, zzbsp zzbspVar, String str5) {
        this.f14143a = null;
        this.f14144b = null;
        this.f14145c = interfaceC7536x;
        this.f14146d = zzcekVar;
        this.f14134A = null;
        this.f14147e = null;
        this.f14149r = false;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzaY)).booleanValue()) {
            this.f14148f = null;
            this.f14150s = null;
        } else {
            this.f14148f = str2;
            this.f14150s = str3;
        }
        this.f14151t = null;
        this.f14152u = i7;
        this.f14153v = 1;
        this.f14154w = null;
        this.f14155x = c7584a;
        this.f14156y = str;
        this.f14157z = c7343l;
        this.f14135B = str5;
        this.f14136C = null;
        this.f14137D = str4;
        this.f14138E = zzcwfVar;
        this.f14139F = null;
        this.f14140G = zzbspVar;
        this.f14141H = false;
        this.f14142I = f14132J.getAndIncrement();
    }

    public AdOverlayInfoParcel(InterfaceC3318a interfaceC3318a, InterfaceC7536x interfaceC7536x, InterfaceC7516d interfaceC7516d, zzcek zzcekVar, boolean z7, int i7, C7584a c7584a, zzddz zzddzVar, zzbsp zzbspVar) {
        this.f14143a = null;
        this.f14144b = interfaceC3318a;
        this.f14145c = interfaceC7536x;
        this.f14146d = zzcekVar;
        this.f14134A = null;
        this.f14147e = null;
        this.f14148f = null;
        this.f14149r = z7;
        this.f14150s = null;
        this.f14151t = interfaceC7516d;
        this.f14152u = i7;
        this.f14153v = 2;
        this.f14154w = null;
        this.f14155x = c7584a;
        this.f14156y = null;
        this.f14157z = null;
        this.f14135B = null;
        this.f14136C = null;
        this.f14137D = null;
        this.f14138E = null;
        this.f14139F = zzddzVar;
        this.f14140G = zzbspVar;
        this.f14141H = false;
        this.f14142I = f14132J.getAndIncrement();
    }

    AdOverlayInfoParcel(C7524l c7524l, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z7, String str2, IBinder iBinder5, int i7, int i8, String str3, C7584a c7584a, String str4, C7343l c7343l, IBinder iBinder6, String str5, String str6, String str7, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, boolean z8, long j7) {
        this.f14143a = c7524l;
        this.f14148f = str;
        this.f14149r = z7;
        this.f14150s = str2;
        this.f14152u = i7;
        this.f14153v = i8;
        this.f14154w = str3;
        this.f14155x = c7584a;
        this.f14156y = str4;
        this.f14157z = c7343l;
        this.f14135B = str5;
        this.f14136C = str6;
        this.f14137D = str7;
        this.f14141H = z8;
        this.f14142I = j7;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zznL)).booleanValue()) {
            C3418b c3418b = (C3418b) f14133K.remove(Long.valueOf(j7));
            if (c3418b != null) {
                this.f14144b = c3418b.m17367a();
                this.f14145c = c3418b.m17368b();
                this.f14146d = c3418b.m17369c();
                this.f14134A = c3418b.m17370d();
                this.f14147e = c3418b.m17371e();
                this.f14138E = c3418b.m17373g();
                this.f14139F = c3418b.m17374h();
                this.f14140G = c3418b.m17375i();
                this.f14151t = c3418b.m17372f();
                c3418b.m17376j().cancel(false);
                return;
            }
            throw new NullPointerException("AdOverlayObjects is null");
        }
        this.f14144b = (InterfaceC3318a) BinderC3773b.m18220M0(InterfaceC3772a.a.m18219L0(iBinder));
        this.f14145c = (InterfaceC7536x) BinderC3773b.m18220M0(InterfaceC3772a.a.m18219L0(iBinder2));
        this.f14146d = (zzcek) BinderC3773b.m18220M0(InterfaceC3772a.a.m18219L0(iBinder3));
        this.f14134A = (zzbib) BinderC3773b.m18220M0(InterfaceC3772a.a.m18219L0(iBinder6));
        this.f14147e = (zzbid) BinderC3773b.m18220M0(InterfaceC3772a.a.m18219L0(iBinder4));
        this.f14151t = (InterfaceC7516d) BinderC3773b.m18220M0(InterfaceC3772a.a.m18219L0(iBinder5));
        this.f14138E = (zzcwf) BinderC3773b.m18220M0(InterfaceC3772a.a.m18219L0(iBinder7));
        this.f14139F = (zzddz) BinderC3773b.m18220M0(InterfaceC3772a.a.m18219L0(iBinder8));
        this.f14140G = (zzbsp) BinderC3773b.m18220M0(InterfaceC3772a.a.m18219L0(iBinder9));
    }

    public AdOverlayInfoParcel(C7524l c7524l, InterfaceC3318a interfaceC3318a, InterfaceC7536x interfaceC7536x, InterfaceC7516d interfaceC7516d, C7584a c7584a, zzcek zzcekVar, zzddz zzddzVar, String str) {
        this.f14143a = c7524l;
        this.f14144b = interfaceC3318a;
        this.f14145c = interfaceC7536x;
        this.f14146d = zzcekVar;
        this.f14134A = null;
        this.f14147e = null;
        this.f14148f = null;
        this.f14149r = false;
        this.f14150s = null;
        this.f14151t = interfaceC7516d;
        this.f14152u = -1;
        this.f14153v = 4;
        this.f14154w = null;
        this.f14155x = c7584a;
        this.f14156y = null;
        this.f14157z = null;
        this.f14135B = str;
        this.f14136C = null;
        this.f14137D = null;
        this.f14138E = null;
        this.f14139F = zzddzVar;
        this.f14140G = null;
        this.f14141H = false;
        this.f14142I = f14132J.getAndIncrement();
    }

    public AdOverlayInfoParcel(InterfaceC7536x interfaceC7536x, zzcek zzcekVar, int i7, C7584a c7584a) {
        this.f14145c = interfaceC7536x;
        this.f14146d = zzcekVar;
        this.f14152u = 1;
        this.f14155x = c7584a;
        this.f14143a = null;
        this.f14144b = null;
        this.f14134A = null;
        this.f14147e = null;
        this.f14148f = null;
        this.f14149r = false;
        this.f14150s = null;
        this.f14151t = null;
        this.f14153v = 1;
        this.f14154w = null;
        this.f14156y = null;
        this.f14157z = null;
        this.f14135B = null;
        this.f14136C = null;
        this.f14137D = null;
        this.f14138E = null;
        this.f14139F = null;
        this.f14140G = null;
        this.f14141H = false;
        this.f14142I = f14132J.getAndIncrement();
    }

    public AdOverlayInfoParcel(zzcek zzcekVar, C7584a c7584a, String str, String str2, int i7, zzbsp zzbspVar) {
        this.f14143a = null;
        this.f14144b = null;
        this.f14145c = null;
        this.f14146d = zzcekVar;
        this.f14134A = null;
        this.f14147e = null;
        this.f14148f = null;
        this.f14149r = false;
        this.f14150s = null;
        this.f14151t = null;
        this.f14152u = 14;
        this.f14153v = 5;
        this.f14154w = null;
        this.f14155x = c7584a;
        this.f14156y = null;
        this.f14157z = null;
        this.f14135B = str;
        this.f14136C = str2;
        this.f14137D = null;
        this.f14138E = null;
        this.f14139F = null;
        this.f14140G = zzbspVar;
        this.f14141H = false;
        this.f14142I = f14132J.getAndIncrement();
    }
}
