package p120P1;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.C3211k;
import com.bumptech.glide.ComponentCallbacks2C3202b;
import com.bumptech.glide.ComponentCallbacks2C3212l;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p011B1.InterfaceC0055a;
import p019C1.InterfaceC0130f;
import p019C1.InterfaceC0136l;
import p035E1.AbstractC0289j;
import p043F1.InterfaceC0406d;
import p155U1.C1663f;
import p162V1.AbstractC1715c;
import p169W1.InterfaceC1822b;
import p176X1.C1944d;
import p183Y1.AbstractC2022k;
import p183Y1.AbstractC2023l;

/* JADX INFO: renamed from: P1.g */
/* JADX INFO: loaded from: classes.dex */
class C1190g {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0055a f4242a;

    /* JADX INFO: renamed from: b */
    private final Handler f4243b;

    /* JADX INFO: renamed from: c */
    private final List f4244c;

    /* JADX INFO: renamed from: d */
    final ComponentCallbacks2C3212l f4245d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC0406d f4246e;

    /* JADX INFO: renamed from: f */
    private boolean f4247f;

    /* JADX INFO: renamed from: g */
    private boolean f4248g;

    /* JADX INFO: renamed from: h */
    private boolean f4249h;

    /* JADX INFO: renamed from: i */
    private C3211k f4250i;

    /* JADX INFO: renamed from: j */
    private a f4251j;

    /* JADX INFO: renamed from: k */
    private boolean f4252k;

    /* JADX INFO: renamed from: l */
    private a f4253l;

    /* JADX INFO: renamed from: m */
    private Bitmap f4254m;

    /* JADX INFO: renamed from: n */
    private InterfaceC0136l f4255n;

    /* JADX INFO: renamed from: o */
    private a f4256o;

    /* JADX INFO: renamed from: p */
    private int f4257p;

    /* JADX INFO: renamed from: q */
    private int f4258q;

    /* JADX INFO: renamed from: r */
    private int f4259r;

    /* JADX INFO: renamed from: P1.g$a */
    static class a extends AbstractC1715c {

        /* JADX INFO: renamed from: d */
        private final Handler f4260d;

        /* JADX INFO: renamed from: e */
        final int f4261e;

        /* JADX INFO: renamed from: f */
        private final long f4262f;

        /* JADX INFO: renamed from: r */
        private Bitmap f4263r;

        a(Handler handler, int i7, long j7) {
            this.f4260d = handler;
            this.f4261e = i7;
            this.f4262f = j7;
        }

        @Override // p162V1.InterfaceC1720h
        /* JADX INFO: renamed from: i */
        public void mo5243i(Drawable drawable) {
            this.f4263r = null;
        }

        /* JADX INFO: renamed from: k */
        Bitmap m5244k() {
            return this.f4263r;
        }

        @Override // p162V1.InterfaceC1720h
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void mo5242c(Bitmap bitmap, InterfaceC1822b interfaceC1822b) {
            this.f4263r = bitmap;
            this.f4260d.sendMessageAtTime(this.f4260d.obtainMessage(1, this), this.f4262f);
        }
    }

    /* JADX INFO: renamed from: P1.g$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo5214a();
    }

    /* JADX INFO: renamed from: P1.g$c */
    private class c implements Handler.Callback {
        c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i7 = message.what;
            if (i7 == 1) {
                C1190g.this.m5238m((a) message.obj);
                return true;
            }
            if (i7 != 2) {
                return false;
            }
            C1190g.this.f4245d.m17074n((a) message.obj);
            return false;
        }
    }

    C1190g(ComponentCallbacks2C3202b componentCallbacks2C3202b, InterfaceC0055a interfaceC0055a, int i7, int i8, InterfaceC0136l interfaceC0136l, Bitmap bitmap) {
        this(componentCallbacks2C3202b.m16998f(), ComponentCallbacks2C3202b.m16994t(componentCallbacks2C3202b.m17000h()), interfaceC0055a, null, m5224i(ComponentCallbacks2C3202b.m16994t(componentCallbacks2C3202b.m17000h()), i7, i8), interfaceC0136l, bitmap);
    }

    /* JADX INFO: renamed from: g */
    private static InterfaceC0130f m5223g() {
        return new C1944d(Double.valueOf(Math.random()));
    }

    /* JADX INFO: renamed from: i */
    private static C3211k m5224i(ComponentCallbacks2C3212l componentCallbacks2C3212l, int i7, int i8) {
        return componentCallbacks2C3212l.m17072l().mo6946a(((C1663f) ((C1663f) C1663f.m6999l0(AbstractC0289j.f1156b).m6965j0(true)).m6953d0(true)).m6941T(i7, i8));
    }

    /* JADX INFO: renamed from: l */
    private void m5225l() {
        if (!this.f4247f || this.f4248g) {
            return;
        }
        if (this.f4249h) {
            AbstractC2022k.m8405b(this.f4256o == null, "Pending target must be null when starting from the first frame");
            this.f4242a.mo213g();
            this.f4249h = false;
        }
        a aVar = this.f4256o;
        if (aVar != null) {
            this.f4256o = null;
            m5238m(aVar);
            return;
        }
        this.f4248g = true;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) this.f4242a.mo211e());
        this.f4242a.mo209c();
        this.f4253l = new a(this.f4243b, this.f4242a.mo214h(), jUptimeMillis);
        this.f4250i.mo6946a(C1663f.m7000m0(m5223g())).m17067z0(this.f4242a).m17063t0(this.f4253l);
    }

    /* JADX INFO: renamed from: n */
    private void m5226n() {
        Bitmap bitmap = this.f4254m;
        if (bitmap != null) {
            this.f4246e.mo1745c(bitmap);
            this.f4254m = null;
        }
    }

    /* JADX INFO: renamed from: p */
    private void m5227p() {
        if (this.f4247f) {
            return;
        }
        this.f4247f = true;
        this.f4252k = false;
        m5225l();
    }

    /* JADX INFO: renamed from: q */
    private void m5228q() {
        this.f4247f = false;
    }

    /* JADX INFO: renamed from: a */
    void m5229a() {
        this.f4244c.clear();
        m5226n();
        m5228q();
        a aVar = this.f4251j;
        if (aVar != null) {
            this.f4245d.m17074n(aVar);
            this.f4251j = null;
        }
        a aVar2 = this.f4253l;
        if (aVar2 != null) {
            this.f4245d.m17074n(aVar2);
            this.f4253l = null;
        }
        a aVar3 = this.f4256o;
        if (aVar3 != null) {
            this.f4245d.m17074n(aVar3);
            this.f4256o = null;
        }
        this.f4242a.clear();
        this.f4252k = true;
    }

    /* JADX INFO: renamed from: b */
    ByteBuffer m5230b() {
        return this.f4242a.getData().asReadOnlyBuffer();
    }

    /* JADX INFO: renamed from: c */
    Bitmap m5231c() {
        a aVar = this.f4251j;
        return aVar != null ? aVar.m5244k() : this.f4254m;
    }

    /* JADX INFO: renamed from: d */
    int m5232d() {
        a aVar = this.f4251j;
        if (aVar != null) {
            return aVar.f4261e;
        }
        return -1;
    }

    /* JADX INFO: renamed from: e */
    Bitmap m5233e() {
        return this.f4254m;
    }

    /* JADX INFO: renamed from: f */
    int m5234f() {
        return this.f4242a.mo210d();
    }

    /* JADX INFO: renamed from: h */
    int m5235h() {
        return this.f4259r;
    }

    /* JADX INFO: renamed from: j */
    int m5236j() {
        return this.f4242a.mo207a() + this.f4257p;
    }

    /* JADX INFO: renamed from: k */
    int m5237k() {
        return this.f4258q;
    }

    /* JADX INFO: renamed from: m */
    void m5238m(a aVar) {
        this.f4248g = false;
        if (this.f4252k) {
            this.f4243b.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f4247f) {
            if (this.f4249h) {
                this.f4243b.obtainMessage(2, aVar).sendToTarget();
                return;
            } else {
                this.f4256o = aVar;
                return;
            }
        }
        if (aVar.m5244k() != null) {
            m5226n();
            a aVar2 = this.f4251j;
            this.f4251j = aVar;
            for (int size = this.f4244c.size() - 1; size >= 0; size--) {
                ((b) this.f4244c.get(size)).mo5214a();
            }
            if (aVar2 != null) {
                this.f4243b.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        m5225l();
    }

    /* JADX INFO: renamed from: o */
    void m5239o(InterfaceC0136l interfaceC0136l, Bitmap bitmap) {
        this.f4255n = (InterfaceC0136l) AbstractC2022k.m8408e(interfaceC0136l);
        this.f4254m = (Bitmap) AbstractC2022k.m8408e(bitmap);
        this.f4250i = this.f4250i.mo6946a(new C1663f().m6957f0(interfaceC0136l));
        this.f4257p = AbstractC2023l.m8417h(bitmap);
        this.f4258q = bitmap.getWidth();
        this.f4259r = bitmap.getHeight();
    }

    /* JADX INFO: renamed from: r */
    void m5240r(b bVar) {
        if (this.f4252k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (this.f4244c.contains(bVar)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = this.f4244c.isEmpty();
        this.f4244c.add(bVar);
        if (zIsEmpty) {
            m5227p();
        }
    }

    /* JADX INFO: renamed from: s */
    void m5241s(b bVar) {
        this.f4244c.remove(bVar);
        if (this.f4244c.isEmpty()) {
            m5228q();
        }
    }

    C1190g(InterfaceC0406d interfaceC0406d, ComponentCallbacks2C3212l componentCallbacks2C3212l, InterfaceC0055a interfaceC0055a, Handler handler, C3211k c3211k, InterfaceC0136l interfaceC0136l, Bitmap bitmap) {
        this.f4244c = new ArrayList();
        this.f4245d = componentCallbacks2C3212l;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.f4246e = interfaceC0406d;
        this.f4243b = handler;
        this.f4250i = c3211k;
        this.f4242a = interfaceC0055a;
        m5239o(interfaceC0136l, bitmap);
    }
}
