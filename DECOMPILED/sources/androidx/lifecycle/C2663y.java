package androidx.lifecycle;

import androidx.appcompat.app.AbstractC2263x;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6107c;
import kotlin.jvm.internal.AbstractC6118n;
import p152T5.AbstractC1638q;
import p302m6.AbstractC6406h;

/* JADX INFO: renamed from: androidx.lifecycle.y */
/* JADX INFO: loaded from: classes.dex */
public final class C2663y {

    /* JADX INFO: renamed from: a */
    public static final C2663y f10501a = new C2663y();

    /* JADX INFO: renamed from: b */
    private static final Map f10502b = new HashMap();

    /* JADX INFO: renamed from: c */
    private static final Map f10503c = new HashMap();

    private C2663y() {
    }

    /* JADX INFO: renamed from: a */
    private final InterfaceC2647i m12658a(Constructor constructor, Object obj) {
        try {
            Object objNewInstance = constructor.newInstance(obj);
            AbstractC6118n.m27184b(objNewInstance);
            AbstractC2263x.m9328a(objNewInstance);
            return null;
        } catch (IllegalAccessException e7) {
            throw new RuntimeException(e7);
        } catch (InstantiationException e8) {
            throw new RuntimeException(e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException(e9);
        }
    }

    /* JADX INFO: renamed from: b */
    private final Constructor m12659b(Class cls) {
        try {
            Package r7 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r7 != null ? r7.getName() : "";
            AbstractC6118n.m27184b(name);
            if (name.length() != 0) {
                AbstractC6118n.m27184b(canonicalName);
                canonicalName = canonicalName.substring(name.length() + 1);
                AbstractC6118n.m27186d(canonicalName, "substring(...)");
            }
            AbstractC6118n.m27184b(canonicalName);
            String strM12660c = m12660c(canonicalName);
            if (name.length() != 0) {
                strM12660c = name + '.' + strM12660c;
            }
            Class<?> cls2 = Class.forName(strM12660c);
            AbstractC6118n.m27185c(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e7) {
            throw new RuntimeException(e7);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final String m12660c(String className) {
        AbstractC6118n.m27187e(className, "className");
        return AbstractC6406h.m27551E(className, ".", "_", false, 4, null) + "_LifecycleAdapter";
    }

    /* JADX INFO: renamed from: d */
    private final int m12661d(Class cls) {
        Map map = f10502b;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int iM12664g = m12664g(cls);
        map.put(cls, Integer.valueOf(iM12664g));
        return iM12664g;
    }

    /* JADX INFO: renamed from: e */
    private final boolean m12662e(Class cls) {
        return cls != null && InterfaceC2656r.class.isAssignableFrom(cls);
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC2654p m12663f(Object object) {
        AbstractC6118n.m27187e(object, "object");
        boolean z7 = object instanceof InterfaceC2654p;
        boolean z8 = object instanceof InterfaceC2644f;
        if (z7 && z8) {
            return new C2645g((InterfaceC2644f) object, (InterfaceC2654p) object);
        }
        if (z8) {
            return new C2645g((InterfaceC2644f) object, null);
        }
        if (z7) {
            return (InterfaceC2654p) object;
        }
        Class<?> cls = object.getClass();
        C2663y c2663y = f10501a;
        if (c2663y.m12661d(cls) != 2) {
            return new C2616H(object);
        }
        Object obj = f10503c.get(cls);
        AbstractC6118n.m27184b(obj);
        List list = (List) obj;
        if (list.size() == 1) {
            c2663y.m12658a((Constructor) list.get(0), object);
            return new C2629V(null);
        }
        int size = list.size();
        InterfaceC2647i[] interfaceC2647iArr = new InterfaceC2647i[size];
        for (int i7 = 0; i7 < size; i7++) {
            f10501a.m12658a((Constructor) list.get(i7), object);
            interfaceC2647iArr[i7] = null;
        }
        return new C2642e(interfaceC2647iArr);
    }

    /* JADX INFO: renamed from: g */
    private final int m12664g(Class cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor constructorM12659b = m12659b(cls);
        if (constructorM12659b != null) {
            f10503c.put(cls, AbstractC1638q.m6759d(constructorM12659b));
            return 2;
        }
        if (C2640d.f10457c.m12614d(cls)) {
            return 1;
        }
        Class superclass = cls.getSuperclass();
        if (m12662e(superclass)) {
            AbstractC6118n.m27184b(superclass);
            if (m12661d(superclass) == 1) {
                return 1;
            }
            Object obj = f10503c.get(superclass);
            AbstractC6118n.m27184b(obj);
            arrayList = new ArrayList((Collection) obj);
        } else {
            arrayList = null;
        }
        Iterator itM27171a = AbstractC6107c.m27171a(cls.getInterfaces());
        while (itM27171a.hasNext()) {
            Class cls2 = (Class) itM27171a.next();
            if (m12662e(cls2)) {
                AbstractC6118n.m27184b(cls2);
                if (m12661d(cls2) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                Object obj2 = f10503c.get(cls2);
                AbstractC6118n.m27184b(obj2);
                arrayList.addAll((Collection) obj2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f10503c.put(cls, arrayList);
        return 2;
    }
}
