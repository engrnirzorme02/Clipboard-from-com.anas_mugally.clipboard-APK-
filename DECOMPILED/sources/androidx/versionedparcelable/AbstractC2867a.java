package androidx.versionedparcelable;

import android.os.Parcelable;
import androidx.collection.C2390a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p074J0.InterfaceC0671a;

/* JADX INFO: renamed from: androidx.versionedparcelable.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2867a {

    /* JADX INFO: renamed from: a */
    protected final C2390a f11679a;

    /* JADX INFO: renamed from: b */
    protected final C2390a f11680b;

    /* JADX INFO: renamed from: c */
    protected final C2390a f11681c;

    public AbstractC2867a(C2390a c2390a, C2390a c2390a2, C2390a c2390a3) {
        this.f11679a = c2390a;
        this.f11680b = c2390a2;
        this.f11681c = c2390a3;
    }

    /* JADX INFO: renamed from: N */
    private void m14279N(InterfaceC0671a interfaceC0671a) {
        try {
            mo14291I(m14280c(interfaceC0671a.getClass()).getName());
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException(interfaceC0671a.getClass().getSimpleName() + " does not have a Parcelizer", e7);
        }
    }

    /* JADX INFO: renamed from: c */
    private Class m14280c(Class cls) throws ClassNotFoundException {
        Class cls2 = (Class) this.f11681c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f11681c.put(cls.getName(), cls3);
        return cls3;
    }

    /* JADX INFO: renamed from: d */
    private Method m14281d(String str) throws NoSuchMethodException {
        Method method = (Method) this.f11679a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC2867a.class.getClassLoader()).getDeclaredMethod("read", AbstractC2867a.class);
        this.f11679a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: e */
    private Method m14282e(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        Method method = (Method) this.f11680b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class clsM14280c = m14280c(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM14280c.getDeclaredMethod("write", cls, AbstractC2867a.class);
        this.f11680b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: A */
    protected abstract void mo14283A(byte[] bArr);

    /* JADX INFO: renamed from: B */
    public void m14284B(byte[] bArr, int i7) {
        mo14315w(i7);
        mo14283A(bArr);
    }

    /* JADX INFO: renamed from: C */
    protected abstract void mo14285C(CharSequence charSequence);

    /* JADX INFO: renamed from: D */
    public void m14286D(CharSequence charSequence, int i7) {
        mo14315w(i7);
        mo14285C(charSequence);
    }

    /* JADX INFO: renamed from: E */
    protected abstract void mo14287E(int i7);

    /* JADX INFO: renamed from: F */
    public void m14288F(int i7, int i8) {
        mo14315w(i8);
        mo14287E(i7);
    }

    /* JADX INFO: renamed from: G */
    protected abstract void mo14289G(Parcelable parcelable);

    /* JADX INFO: renamed from: H */
    public void m14290H(Parcelable parcelable, int i7) {
        mo14315w(i7);
        mo14289G(parcelable);
    }

    /* JADX INFO: renamed from: I */
    protected abstract void mo14291I(String str);

    /* JADX INFO: renamed from: J */
    public void m14292J(String str, int i7) {
        mo14315w(i7);
        mo14291I(str);
    }

    /* JADX INFO: renamed from: K */
    protected void m14293K(InterfaceC0671a interfaceC0671a, AbstractC2867a abstractC2867a) {
        try {
            m14282e(interfaceC0671a.getClass()).invoke(null, interfaceC0671a, abstractC2867a);
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e7);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e8);
        } catch (NoSuchMethodException e9) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e9);
        } catch (InvocationTargetException e10) {
            if (!(e10.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e10);
            }
            throw ((RuntimeException) e10.getCause());
        }
    }

    /* JADX INFO: renamed from: L */
    protected void m14294L(InterfaceC0671a interfaceC0671a) {
        if (interfaceC0671a == null) {
            mo14291I(null);
            return;
        }
        m14279N(interfaceC0671a);
        AbstractC2867a abstractC2867aMo14297b = mo14297b();
        m14293K(interfaceC0671a, abstractC2867aMo14297b);
        abstractC2867aMo14297b.mo14296a();
    }

    /* JADX INFO: renamed from: M */
    public void m14295M(InterfaceC0671a interfaceC0671a, int i7) {
        mo14315w(i7);
        m14294L(interfaceC0671a);
    }

    /* JADX INFO: renamed from: a */
    protected abstract void mo14296a();

    /* JADX INFO: renamed from: b */
    protected abstract AbstractC2867a mo14297b();

    /* JADX INFO: renamed from: f */
    public boolean m14298f() {
        return false;
    }

    /* JADX INFO: renamed from: g */
    protected abstract boolean mo14299g();

    /* JADX INFO: renamed from: h */
    public boolean m14300h(boolean z7, int i7) {
        return !mo14305m(i7) ? z7 : mo14299g();
    }

    /* JADX INFO: renamed from: i */
    protected abstract byte[] mo14301i();

    /* JADX INFO: renamed from: j */
    public byte[] m14302j(byte[] bArr, int i7) {
        return !mo14305m(i7) ? bArr : mo14301i();
    }

    /* JADX INFO: renamed from: k */
    protected abstract CharSequence mo14303k();

    /* JADX INFO: renamed from: l */
    public CharSequence m14304l(CharSequence charSequence, int i7) {
        return !mo14305m(i7) ? charSequence : mo14303k();
    }

    /* JADX INFO: renamed from: m */
    protected abstract boolean mo14305m(int i7);

    /* JADX INFO: renamed from: n */
    protected InterfaceC0671a m14306n(String str, AbstractC2867a abstractC2867a) {
        try {
            return (InterfaceC0671a) m14281d(str).invoke(null, abstractC2867a);
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e7);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e8);
        } catch (NoSuchMethodException e9) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e9);
        } catch (InvocationTargetException e10) {
            if (e10.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e10.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e10);
        }
    }

    /* JADX INFO: renamed from: o */
    protected abstract int mo14307o();

    /* JADX INFO: renamed from: p */
    public int m14308p(int i7, int i8) {
        return !mo14305m(i8) ? i7 : mo14307o();
    }

    /* JADX INFO: renamed from: q */
    protected abstract Parcelable mo14309q();

    /* JADX INFO: renamed from: r */
    public Parcelable m14310r(Parcelable parcelable, int i7) {
        return !mo14305m(i7) ? parcelable : mo14309q();
    }

    /* JADX INFO: renamed from: s */
    protected abstract String mo14311s();

    /* JADX INFO: renamed from: t */
    public String m14312t(String str, int i7) {
        return !mo14305m(i7) ? str : mo14311s();
    }

    /* JADX INFO: renamed from: u */
    protected InterfaceC0671a m14313u() {
        String strMo14311s = mo14311s();
        if (strMo14311s == null) {
            return null;
        }
        return m14306n(strMo14311s, mo14297b());
    }

    /* JADX INFO: renamed from: v */
    public InterfaceC0671a m14314v(InterfaceC0671a interfaceC0671a, int i7) {
        return !mo14305m(i7) ? interfaceC0671a : m14313u();
    }

    /* JADX INFO: renamed from: w */
    protected abstract void mo14315w(int i7);

    /* JADX INFO: renamed from: x */
    public void m14316x(boolean z7, boolean z8) {
    }

    /* JADX INFO: renamed from: y */
    protected abstract void mo14317y(boolean z7);

    /* JADX INFO: renamed from: z */
    public void m14318z(boolean z7, int i7) {
        mo14315w(i7);
        mo14317y(z7);
    }
}
