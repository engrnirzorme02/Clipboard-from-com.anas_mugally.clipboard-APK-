package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.AbstractC2650l;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import p264i0.C5662c;

/* JADX INFO: renamed from: androidx.fragment.app.x */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2606x {

    /* JADX INFO: renamed from: a */
    private final AbstractC2595m f10340a;

    /* JADX INFO: renamed from: b */
    private final ClassLoader f10341b;

    /* JADX INFO: renamed from: d */
    int f10343d;

    /* JADX INFO: renamed from: e */
    int f10344e;

    /* JADX INFO: renamed from: f */
    int f10345f;

    /* JADX INFO: renamed from: g */
    int f10346g;

    /* JADX INFO: renamed from: h */
    int f10347h;

    /* JADX INFO: renamed from: i */
    boolean f10348i;

    /* JADX INFO: renamed from: k */
    String f10350k;

    /* JADX INFO: renamed from: l */
    int f10351l;

    /* JADX INFO: renamed from: m */
    CharSequence f10352m;

    /* JADX INFO: renamed from: n */
    int f10353n;

    /* JADX INFO: renamed from: o */
    CharSequence f10354o;

    /* JADX INFO: renamed from: p */
    ArrayList f10355p;

    /* JADX INFO: renamed from: q */
    ArrayList f10356q;

    /* JADX INFO: renamed from: s */
    ArrayList f10358s;

    /* JADX INFO: renamed from: c */
    ArrayList f10342c = new ArrayList();

    /* JADX INFO: renamed from: j */
    boolean f10349j = true;

    /* JADX INFO: renamed from: r */
    boolean f10357r = false;

    /* JADX INFO: renamed from: androidx.fragment.app.x$a */
    static final class a {

        /* JADX INFO: renamed from: a */
        int f10359a;

        /* JADX INFO: renamed from: b */
        AbstractComponentCallbacksC2591i f10360b;

        /* JADX INFO: renamed from: c */
        boolean f10361c;

        /* JADX INFO: renamed from: d */
        int f10362d;

        /* JADX INFO: renamed from: e */
        int f10363e;

        /* JADX INFO: renamed from: f */
        int f10364f;

        /* JADX INFO: renamed from: g */
        int f10365g;

        /* JADX INFO: renamed from: h */
        AbstractC2650l.b f10366h;

        /* JADX INFO: renamed from: i */
        AbstractC2650l.b f10367i;

        a() {
        }

        a(int i7, AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
            this.f10359a = i7;
            this.f10360b = abstractComponentCallbacksC2591i;
            this.f10361c = false;
            AbstractC2650l.b bVar = AbstractC2650l.b.RESUMED;
            this.f10366h = bVar;
            this.f10367i = bVar;
        }

        a(int i7, AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i, boolean z7) {
            this.f10359a = i7;
            this.f10360b = abstractComponentCallbacksC2591i;
            this.f10361c = z7;
            AbstractC2650l.b bVar = AbstractC2650l.b.RESUMED;
            this.f10366h = bVar;
            this.f10367i = bVar;
        }

        a(int i7, AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i, AbstractC2650l.b bVar) {
            this.f10359a = i7;
            this.f10360b = abstractComponentCallbacksC2591i;
            this.f10361c = false;
            this.f10366h = abstractComponentCallbacksC2591i.f10152d0;
            this.f10367i = bVar;
        }
    }

    AbstractC2606x(AbstractC2595m abstractC2595m, ClassLoader classLoader) {
        this.f10340a = abstractC2595m;
        this.f10341b = classLoader;
    }

    /* JADX INFO: renamed from: b */
    public AbstractC2606x m12505b(int i7, AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i, String str) {
        mo12021m(i7, abstractComponentCallbacksC2591i, str, 1);
        return this;
    }

    /* JADX INFO: renamed from: c */
    AbstractC2606x m12506c(ViewGroup viewGroup, AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i, String str) {
        abstractComponentCallbacksC2591i.f10137S = viewGroup;
        return m12505b(viewGroup.getId(), abstractComponentCallbacksC2591i, str);
    }

    /* JADX INFO: renamed from: d */
    public AbstractC2606x m12507d(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i, String str) {
        mo12021m(0, abstractComponentCallbacksC2591i, str, 1);
        return this;
    }

    /* JADX INFO: renamed from: e */
    void m12508e(a aVar) {
        this.f10342c.add(aVar);
        aVar.f10362d = this.f10343d;
        aVar.f10363e = this.f10344e;
        aVar.f10364f = this.f10345f;
        aVar.f10365g = this.f10346g;
    }

    /* JADX INFO: renamed from: f */
    public AbstractC2606x m12509f(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        m12508e(new a(7, abstractComponentCallbacksC2591i));
        return this;
    }

    /* JADX INFO: renamed from: g */
    public abstract int mo12016g();

    /* JADX INFO: renamed from: h */
    public abstract int mo12017h();

    /* JADX INFO: renamed from: i */
    public abstract void mo12018i();

    /* JADX INFO: renamed from: j */
    public abstract void mo12019j();

    /* JADX INFO: renamed from: k */
    public AbstractC2606x mo12020k(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        m12508e(new a(6, abstractComponentCallbacksC2591i));
        return this;
    }

    /* JADX INFO: renamed from: l */
    public AbstractC2606x m12510l() {
        if (this.f10348i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f10349j = false;
        return this;
    }

    /* JADX INFO: renamed from: m */
    void mo12021m(int i7, AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i, String str, int i8) {
        String str2 = abstractComponentCallbacksC2591i.f10150c0;
        if (str2 != null) {
            C5662c.m25181f(abstractComponentCallbacksC2591i, str2);
        }
        Class<?> cls = abstractComponentCallbacksC2591i.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = abstractComponentCallbacksC2591i.f10129K;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + abstractComponentCallbacksC2591i + ": was " + abstractComponentCallbacksC2591i.f10129K + " now " + str);
            }
            abstractComponentCallbacksC2591i.f10129K = str;
        }
        if (i7 != 0) {
            if (i7 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + abstractComponentCallbacksC2591i + " with tag " + str + " to container view with no id");
            }
            int i9 = abstractComponentCallbacksC2591i.f10127I;
            if (i9 != 0 && i9 != i7) {
                throw new IllegalStateException("Can't change container ID of fragment " + abstractComponentCallbacksC2591i + ": was " + abstractComponentCallbacksC2591i.f10127I + " now " + i7);
            }
            abstractComponentCallbacksC2591i.f10127I = i7;
            abstractComponentCallbacksC2591i.f10128J = i7;
        }
        m12508e(new a(i8, abstractComponentCallbacksC2591i));
    }

    /* JADX INFO: renamed from: n */
    public abstract boolean mo12022n();

    /* JADX INFO: renamed from: o */
    public AbstractC2606x mo12023o(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        m12508e(new a(3, abstractComponentCallbacksC2591i));
        return this;
    }

    /* JADX INFO: renamed from: p */
    public AbstractC2606x m12511p(int i7, AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        return m12512q(i7, abstractComponentCallbacksC2591i, null);
    }

    /* JADX INFO: renamed from: q */
    public AbstractC2606x m12512q(int i7, AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i, String str) {
        if (i7 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        mo12021m(i7, abstractComponentCallbacksC2591i, str, 2);
        return this;
    }

    /* JADX INFO: renamed from: r */
    public AbstractC2606x mo12024r(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i, AbstractC2650l.b bVar) {
        m12508e(new a(10, abstractComponentCallbacksC2591i, bVar));
        return this;
    }

    /* JADX INFO: renamed from: s */
    public AbstractC2606x m12513s(boolean z7) {
        this.f10357r = z7;
        return this;
    }
}
