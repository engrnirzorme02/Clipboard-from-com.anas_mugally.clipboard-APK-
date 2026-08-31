package com.bumptech.glide;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C3221f;
import com.bumptech.glide.load.data.InterfaceC3220e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p019C1.InterfaceC0128d;
import p019C1.InterfaceC0134j;
import p019C1.InterfaceC0135k;
import p035E1.C0288i;
import p035E1.C0299t;
import p035E1.InterfaceC0301v;
import p067I1.C0596p;
import p067I1.InterfaceC0595o;
import p104N.InterfaceC0907d;
import p127Q1.C1252f;
import p127Q1.InterfaceC1251e;
import p148T1.C1455a;
import p148T1.C1456b;
import p148T1.C1457c;
import p148T1.C1458d;
import p148T1.C1459e;
import p148T1.C1460f;
import p190Z1.AbstractC2083a;

/* JADX INFO: renamed from: com.bumptech.glide.i */
/* JADX INFO: loaded from: classes.dex */
public class C3209i {

    /* JADX INFO: renamed from: a */
    private final C0596p f13734a;

    /* JADX INFO: renamed from: b */
    private final C1455a f13735b;

    /* JADX INFO: renamed from: c */
    private final C1459e f13736c;

    /* JADX INFO: renamed from: d */
    private final C1460f f13737d;

    /* JADX INFO: renamed from: e */
    private final C3221f f13738e;

    /* JADX INFO: renamed from: f */
    private final C1252f f13739f;

    /* JADX INFO: renamed from: g */
    private final C1456b f13740g;

    /* JADX INFO: renamed from: h */
    private final C1458d f13741h = new C1458d();

    /* JADX INFO: renamed from: i */
    private final C1457c f13742i = new C1457c();

    /* JADX INFO: renamed from: j */
    private final InterfaceC0907d f13743j;

    /* JADX INFO: renamed from: com.bumptech.glide.i$a */
    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.i$b */
    public static final class b extends a {
        public b() {
            super("Failed to find image header parser.");
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.i$c */
    public static class c extends a {
        public c(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public c(Object obj, List list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + obj);
        }

        public c(Class cls, Class cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.i$d */
    public static class d extends a {
        public d(Class cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.i$e */
    public static class e extends a {
        public e(Class cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public C3209i() {
        InterfaceC0907d interfaceC0907dM8599e = AbstractC2083a.m8599e();
        this.f13743j = interfaceC0907dM8599e;
        this.f13734a = new C0596p(interfaceC0907dM8599e);
        this.f13735b = new C1455a();
        this.f13736c = new C1459e();
        this.f13737d = new C1460f();
        this.f13738e = new C3221f();
        this.f13739f = new C1252f();
        this.f13740g = new C1456b();
        m17042r(Arrays.asList("Animation", "Bitmap", "BitmapDrawable"));
    }

    /* JADX INFO: renamed from: f */
    private List m17025f(Class cls, Class cls2, Class cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f13736c.m6117d(cls, cls2)) {
            for (Class cls5 : this.f13739f.m5499b(cls4, cls3)) {
                arrayList.add(new C0288i(cls, cls4, cls5, this.f13736c.m6116b(cls, cls4), this.f13739f.m5498a(cls4, cls5), this.f13743j));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public C3209i m17026a(Class cls, InterfaceC0128d interfaceC0128d) {
        this.f13735b.m6103a(cls, interfaceC0128d);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C3209i m17027b(Class cls, InterfaceC0135k interfaceC0135k) {
        this.f13737d.m6120a(cls, interfaceC0135k);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public C3209i m17028c(Class cls, Class cls2, InterfaceC0134j interfaceC0134j) {
        m17030e("legacy_append", cls, cls2, interfaceC0134j);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public C3209i m17029d(Class cls, Class cls2, InterfaceC0595o interfaceC0595o) {
        this.f13734a.m2617a(cls, cls2, interfaceC0595o);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public C3209i m17030e(String str, Class cls, Class cls2, InterfaceC0134j interfaceC0134j) {
        this.f13736c.m6115a(str, interfaceC0134j, cls, cls2);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public List m17031g() {
        List listM6107b = this.f13740g.m6107b();
        if (listM6107b.isEmpty()) {
            throw new b();
        }
        return listM6107b;
    }

    /* JADX INFO: renamed from: h */
    public C0299t m17032h(Class cls, Class cls2, Class cls3) {
        Class cls4;
        Class cls5;
        Class cls6;
        C0299t c0299tM6109a = this.f13742i.m6109a(cls, cls2, cls3);
        C0299t c0299t = null;
        if (this.f13742i.m6110c(c0299tM6109a)) {
            return null;
        }
        if (c0299tM6109a != null) {
            return c0299tM6109a;
        }
        List listM17025f = m17025f(cls, cls2, cls3);
        if (listM17025f.isEmpty()) {
            cls4 = cls;
            cls5 = cls2;
            cls6 = cls3;
        } else {
            cls4 = cls;
            cls5 = cls2;
            cls6 = cls3;
            c0299t = new C0299t(cls4, cls5, cls6, listM17025f, this.f13743j);
        }
        this.f13742i.m6111d(cls4, cls5, cls6, c0299t);
        return c0299t;
    }

    /* JADX INFO: renamed from: i */
    public List m17033i(Object obj) {
        return this.f13734a.m2619d(obj);
    }

    /* JADX INFO: renamed from: j */
    public List m17034j(Class cls, Class cls2, Class cls3) {
        List listM6112a = this.f13741h.m6112a(cls, cls2, cls3);
        if (listM6112a == null) {
            listM6112a = new ArrayList();
            Iterator it = this.f13734a.m2618c(cls).iterator();
            while (it.hasNext()) {
                for (Class cls4 : this.f13736c.m6117d((Class) it.next(), cls2)) {
                    if (!this.f13739f.m5499b(cls4, cls3).isEmpty() && !listM6112a.contains(cls4)) {
                        listM6112a.add(cls4);
                    }
                }
            }
            this.f13741h.m6113b(cls, cls2, cls3, Collections.unmodifiableList(listM6112a));
        }
        return listM6112a;
    }

    /* JADX INFO: renamed from: k */
    public InterfaceC0135k m17035k(InterfaceC0301v interfaceC0301v) {
        InterfaceC0135k interfaceC0135kM6121b = this.f13737d.m6121b(interfaceC0301v.mo1438d());
        if (interfaceC0135kM6121b != null) {
            return interfaceC0135kM6121b;
        }
        throw new d(interfaceC0301v.mo1438d());
    }

    /* JADX INFO: renamed from: l */
    public InterfaceC3220e m17036l(Object obj) {
        return this.f13738e.m17114a(obj);
    }

    /* JADX INFO: renamed from: m */
    public InterfaceC0128d m17037m(Object obj) {
        InterfaceC0128d interfaceC0128dM6104b = this.f13735b.m6104b(obj.getClass());
        if (interfaceC0128dM6104b != null) {
            return interfaceC0128dM6104b;
        }
        throw new e(obj.getClass());
    }

    /* JADX INFO: renamed from: n */
    public boolean m17038n(InterfaceC0301v interfaceC0301v) {
        return this.f13737d.m6121b(interfaceC0301v.mo1438d()) != null;
    }

    /* JADX INFO: renamed from: o */
    public C3209i m17039o(ImageHeaderParser imageHeaderParser) {
        this.f13740g.m6106a(imageHeaderParser);
        return this;
    }

    /* JADX INFO: renamed from: p */
    public C3209i m17040p(InterfaceC3220e.a aVar) {
        this.f13738e.m17115b(aVar);
        return this;
    }

    /* JADX INFO: renamed from: q */
    public C3209i m17041q(Class cls, Class cls2, InterfaceC1251e interfaceC1251e) {
        this.f13739f.m5500c(cls, cls2, interfaceC1251e);
        return this;
    }

    /* JADX INFO: renamed from: r */
    public final C3209i m17042r(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        this.f13736c.m6118e(arrayList);
        return this;
    }
}
