package com.google.android.gms.ads.internal.client;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbhs;
import com.google.android.gms.internal.ads.zzbht;
import com.google.android.gms.internal.ads.zzbst;
import com.google.android.gms.internal.ads.zzbwm;
import java.util.Random;
import p404z2.C7584a;
import p404z2.C7590g;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.B */
/* JADX INFO: loaded from: classes.dex */
public final class C3244B {

    /* JADX INFO: renamed from: f */
    private static final C3244B f13869f = new C3244B();

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f13870g = 0;

    /* JADX INFO: renamed from: a */
    private final C7590g f13871a;

    /* JADX INFO: renamed from: b */
    private final C3411y f13872b;

    /* JADX INFO: renamed from: c */
    private final String f13873c;

    /* JADX INFO: renamed from: d */
    private final C7584a f13874d;

    /* JADX INFO: renamed from: e */
    private final Random f13875e;

    protected C3244B() {
        C7590g c7590g = new C7590g();
        C3411y c3411y = new C3411y(new C3341f2(), new C3333d2(), new C3258F1(), new zzbhs(), new zzbwm(), new zzbst(), new zzbht(), new C3345g2());
        String strM33287r = C7590g.m33287r();
        C7584a c7584a = new C7584a(0, ModuleDescriptor.MODULE_VERSION, true);
        Random random = new Random();
        this.f13871a = c7590g;
        this.f13872b = c3411y;
        this.f13873c = strM33287r;
        this.f13874d = c7584a;
        this.f13875e = random;
    }

    /* JADX INFO: renamed from: a */
    public static C7590g m17190a() {
        return f13869f.f13871a;
    }

    /* JADX INFO: renamed from: b */
    public static C3411y m17191b() {
        return f13869f.f13872b;
    }

    /* JADX INFO: renamed from: c */
    public static String m17192c() {
        return f13869f.f13873c;
    }

    /* JADX INFO: renamed from: d */
    public static C7584a m17193d() {
        return f13869f.f13874d;
    }

    /* JADX INFO: renamed from: e */
    public static Random m17194e() {
        return f13869f.f13875e;
    }
}
