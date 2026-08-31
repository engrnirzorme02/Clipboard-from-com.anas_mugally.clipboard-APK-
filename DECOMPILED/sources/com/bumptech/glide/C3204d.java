package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import java.util.List;
import java.util.Map;
import p035E1.C0290k;
import p043F1.InterfaceC0404b;
import p155U1.C1663f;
import p162V1.AbstractC1721i;
import p162V1.C1718f;
import p183Y1.AbstractC2017f;

/* JADX INFO: renamed from: com.bumptech.glide.d */
/* JADX INFO: loaded from: classes.dex */
public class C3204d extends ContextWrapper {

    /* JADX INFO: renamed from: k */
    static final AbstractC3230m f13710k = new C3201a();

    /* JADX INFO: renamed from: a */
    private final InterfaceC0404b f13711a;

    /* JADX INFO: renamed from: b */
    private final AbstractC2017f.b f13712b;

    /* JADX INFO: renamed from: c */
    private final C1718f f13713c;

    /* JADX INFO: renamed from: d */
    private final ComponentCallbacks2C3202b.a f13714d;

    /* JADX INFO: renamed from: e */
    private final List f13715e;

    /* JADX INFO: renamed from: f */
    private final Map f13716f;

    /* JADX INFO: renamed from: g */
    private final C0290k f13717g;

    /* JADX INFO: renamed from: h */
    private final C3205e f13718h;

    /* JADX INFO: renamed from: i */
    private final int f13719i;

    /* JADX INFO: renamed from: j */
    private C1663f f13720j;

    public C3204d(Context context, InterfaceC0404b interfaceC0404b, AbstractC2017f.b bVar, C1718f c1718f, ComponentCallbacks2C3202b.a aVar, Map map, List list, C0290k c0290k, C3205e c3205e, int i7) {
        super(context.getApplicationContext());
        this.f13711a = interfaceC0404b;
        this.f13713c = c1718f;
        this.f13714d = aVar;
        this.f13715e = list;
        this.f13716f = map;
        this.f13717g = c0290k;
        this.f13718h = c3205e;
        this.f13719i = i7;
        this.f13712b = AbstractC2017f.m8391a(bVar);
    }

    /* JADX INFO: renamed from: a */
    public AbstractC1721i m17011a(ImageView imageView, Class cls) {
        return this.f13713c.m7322a(imageView, cls);
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC0404b m17012b() {
        return this.f13711a;
    }

    /* JADX INFO: renamed from: c */
    public List m17013c() {
        return this.f13715e;
    }

    /* JADX INFO: renamed from: d */
    public synchronized C1663f m17014d() {
        try {
            if (this.f13720j == null) {
                this.f13720j = (C1663f) this.f13714d.mo17008a().m6936N();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f13720j;
    }

    /* JADX INFO: renamed from: e */
    public AbstractC3230m m17015e(Class cls) {
        AbstractC3230m abstractC3230m = (AbstractC3230m) this.f13716f.get(cls);
        if (abstractC3230m == null) {
            for (Map.Entry entry : this.f13716f.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    abstractC3230m = (AbstractC3230m) entry.getValue();
                }
            }
        }
        return abstractC3230m == null ? f13710k : abstractC3230m;
    }

    /* JADX INFO: renamed from: f */
    public C0290k m17016f() {
        return this.f13717g;
    }

    /* JADX INFO: renamed from: g */
    public C3205e m17017g() {
        return this.f13718h;
    }

    /* JADX INFO: renamed from: h */
    public int m17018h() {
        return this.f13719i;
    }

    /* JADX INFO: renamed from: i */
    public C3209i m17019i() {
        return (C3209i) this.f13712b.get();
    }
}
