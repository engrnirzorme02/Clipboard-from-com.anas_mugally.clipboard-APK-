package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.d */
/* JADX INFO: loaded from: classes.dex */
final class C2640d {

    /* JADX INFO: renamed from: c */
    static C2640d f10457c = new C2640d();

    /* JADX INFO: renamed from: a */
    private final Map f10458a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final Map f10459b = new HashMap();

    /* JADX INFO: renamed from: androidx.lifecycle.d$a */
    static class a {

        /* JADX INFO: renamed from: a */
        final Map f10460a = new HashMap();

        /* JADX INFO: renamed from: b */
        final Map f10461b;

        a(Map map) {
            this.f10461b = map;
            for (Map.Entry entry : map.entrySet()) {
                AbstractC2650l.a aVar = (AbstractC2650l.a) entry.getValue();
                List arrayList = (List) this.f10460a.get(aVar);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f10460a.put(aVar, arrayList);
                }
                arrayList.add((b) entry.getKey());
            }
        }

        /* JADX INFO: renamed from: b */
        private static void m12615b(List list, InterfaceC2657s interfaceC2657s, AbstractC2650l.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((b) list.get(size)).m12617a(interfaceC2657s, aVar, obj);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        void m12616a(InterfaceC2657s interfaceC2657s, AbstractC2650l.a aVar, Object obj) {
            m12615b((List) this.f10460a.get(aVar), interfaceC2657s, aVar, obj);
            m12615b((List) this.f10460a.get(AbstractC2650l.a.ON_ANY), interfaceC2657s, aVar, obj);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.d$b */
    static final class b {

        /* JADX INFO: renamed from: a */
        final int f10462a;

        /* JADX INFO: renamed from: b */
        final Method f10463b;

        b(int i7, Method method) {
            this.f10462a = i7;
            this.f10463b = method;
            method.setAccessible(true);
        }

        /* JADX INFO: renamed from: a */
        void m12617a(InterfaceC2657s interfaceC2657s, AbstractC2650l.a aVar, Object obj) {
            try {
                int i7 = this.f10462a;
                if (i7 == 0) {
                    this.f10463b.invoke(obj, new Object[0]);
                } else if (i7 == 1) {
                    this.f10463b.invoke(obj, interfaceC2657s);
                } else {
                    if (i7 != 2) {
                        return;
                    }
                    this.f10463b.invoke(obj, interfaceC2657s, aVar);
                }
            } catch (IllegalAccessException e7) {
                throw new RuntimeException(e7);
            } catch (InvocationTargetException e8) {
                throw new RuntimeException("Failed to call observer method", e8.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f10462a == bVar.f10462a && this.f10463b.getName().equals(bVar.f10463b.getName());
        }

        public int hashCode() {
            return (this.f10462a * 31) + this.f10463b.getName().hashCode();
        }
    }

    C2640d() {
    }

    /* JADX INFO: renamed from: a */
    private a m12610a(Class cls, Method[] methodArr) {
        int i7;
        a aVarM12613c;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (aVarM12613c = m12613c(superclass)) != null) {
            map.putAll(aVarM12613c.f10461b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : m12613c(cls2).f10461b.entrySet()) {
                m12612e(map, (b) entry.getKey(), (AbstractC2650l.a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m12611b(cls);
        }
        boolean z7 = false;
        for (Method method : methodArr) {
            InterfaceC2613E interfaceC2613E = (InterfaceC2613E) method.getAnnotation(InterfaceC2613E.class);
            if (interfaceC2613E != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i7 = 0;
                } else {
                    if (!InterfaceC2657s.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i7 = 1;
                }
                AbstractC2650l.a aVarValue = interfaceC2613E.value();
                if (parameterTypes.length > 1) {
                    if (!AbstractC2650l.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (aVarValue != AbstractC2650l.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i7 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m12612e(map, new b(i7, method), aVarValue, cls);
                z7 = true;
            }
        }
        a aVar = new a(map);
        this.f10458a.put(cls, aVar);
        this.f10459b.put(cls, Boolean.valueOf(z7));
        return aVar;
    }

    /* JADX INFO: renamed from: b */
    private Method[] m12611b(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e7) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e7);
        }
    }

    /* JADX INFO: renamed from: e */
    private void m12612e(Map map, b bVar, AbstractC2650l.a aVar, Class cls) {
        AbstractC2650l.a aVar2 = (AbstractC2650l.a) map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(bVar, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f10463b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    /* JADX INFO: renamed from: c */
    a m12613c(Class cls) {
        a aVar = (a) this.f10458a.get(cls);
        return aVar != null ? aVar : m12610a(cls, null);
    }

    /* JADX INFO: renamed from: d */
    boolean m12614d(Class cls) {
        Boolean bool = (Boolean) this.f10459b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrM12611b = m12611b(cls);
        for (Method method : methodArrM12611b) {
            if (((InterfaceC2613E) method.getAnnotation(InterfaceC2613E.class)) != null) {
                m12610a(cls, methodArrM12611b);
                return true;
            }
        }
        this.f10459b.put(cls, Boolean.FALSE);
        return false;
    }
}
