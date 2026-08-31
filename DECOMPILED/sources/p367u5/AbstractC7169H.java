package p367u5;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: u5.H */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7169H {

    /* JADX INFO: renamed from: a */
    public static final AbstractC7169H f28638a = m31681c();

    /* JADX INFO: renamed from: u5.H$a */
    class a extends AbstractC7169H {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Method f28639b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Object f28640c;

        a(Method method, Object obj) {
            this.f28639b = method;
            this.f28640c = obj;
        }

        @Override // p367u5.AbstractC7169H
        /* JADX INFO: renamed from: d */
        public Object mo31682d(Class cls) {
            AbstractC7169H.m31680b(cls);
            return this.f28639b.invoke(this.f28640c, cls);
        }
    }

    /* JADX INFO: renamed from: u5.H$b */
    class b extends AbstractC7169H {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Method f28641b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f28642c;

        b(Method method, int i7) {
            this.f28641b = method;
            this.f28642c = i7;
        }

        @Override // p367u5.AbstractC7169H
        /* JADX INFO: renamed from: d */
        public Object mo31682d(Class cls) {
            AbstractC7169H.m31680b(cls);
            return this.f28641b.invoke(null, cls, Integer.valueOf(this.f28642c));
        }
    }

    /* JADX INFO: renamed from: u5.H$c */
    class c extends AbstractC7169H {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Method f28643b;

        c(Method method) {
            this.f28643b = method;
        }

        @Override // p367u5.AbstractC7169H
        /* JADX INFO: renamed from: d */
        public Object mo31682d(Class cls) {
            AbstractC7169H.m31680b(cls);
            return this.f28643b.invoke(null, cls, Object.class);
        }
    }

    /* JADX INFO: renamed from: u5.H$d */
    class d extends AbstractC7169H {
        d() {
        }

        @Override // p367u5.AbstractC7169H
        /* JADX INFO: renamed from: d */
        public Object mo31682d(Class cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static void m31680b(Class cls) {
        String strM31704t = C7189t.m31704t(cls);
        if (strM31704t == null) {
            return;
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: " + strM31704t);
    }

    /* JADX INFO: renamed from: c */
    private static AbstractC7169H m31681c() {
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    return new a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
                } catch (Exception unused) {
                    return new d();
                }
            } catch (Exception unused2) {
                Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod.setAccessible(true);
                return new c(declaredMethod);
            }
        } catch (Exception unused3) {
            Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
            declaredMethod2.setAccessible(true);
            int iIntValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
            Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
            declaredMethod3.setAccessible(true);
            return new b(declaredMethod3, iIntValue);
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract Object mo31682d(Class cls);
}
