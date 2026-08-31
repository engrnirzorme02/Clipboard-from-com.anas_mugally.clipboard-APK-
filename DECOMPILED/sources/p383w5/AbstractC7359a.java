package p383w5;

import com.google.gson.C5029h;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import p367u5.AbstractC7168G;

/* JADX INFO: renamed from: w5.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7359a {

    /* JADX INFO: renamed from: a */
    private static final b f29322a;

    /* JADX INFO: renamed from: w5.a$b */
    private static abstract class b {
        private b() {
        }

        /* JADX INFO: renamed from: a */
        abstract Method mo32410a(Class cls, Field field);

        /* JADX INFO: renamed from: b */
        abstract Constructor mo32411b(Class cls);

        /* JADX INFO: renamed from: c */
        abstract String[] mo32412c(Class cls);

        /* JADX INFO: renamed from: d */
        abstract boolean mo32413d(Class cls);
    }

    /* JADX INFO: renamed from: w5.a$c */
    private static class c extends b {
        private c() {
            super();
        }

        @Override // p383w5.AbstractC7359a.b
        /* JADX INFO: renamed from: a */
        public Method mo32410a(Class cls, Field field) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // p383w5.AbstractC7359a.b
        /* JADX INFO: renamed from: b */
        Constructor mo32411b(Class cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // p383w5.AbstractC7359a.b
        /* JADX INFO: renamed from: c */
        String[] mo32412c(Class cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // p383w5.AbstractC7359a.b
        /* JADX INFO: renamed from: d */
        boolean mo32413d(Class cls) {
            return false;
        }
    }

    /* JADX INFO: renamed from: w5.a$d */
    private static class d extends b {

        /* JADX INFO: renamed from: a */
        private final Method f29323a;

        /* JADX INFO: renamed from: b */
        private final Method f29324b;

        /* JADX INFO: renamed from: c */
        private final Method f29325c;

        /* JADX INFO: renamed from: d */
        private final Method f29326d;

        @Override // p383w5.AbstractC7359a.b
        /* JADX INFO: renamed from: a */
        public Method mo32410a(Class cls, Field field) {
            try {
                return cls.getMethod(field.getName(), new Class[0]);
            } catch (ReflectiveOperationException e7) {
                throw AbstractC7359a.m32397d(e7);
            }
        }

        @Override // p383w5.AbstractC7359a.b
        /* JADX INFO: renamed from: b */
        public Constructor mo32411b(Class cls) {
            try {
                Object[] objArr = (Object[]) this.f29324b.invoke(cls, new Object[0]);
                Class<?>[] clsArr = new Class[objArr.length];
                for (int i7 = 0; i7 < objArr.length; i7++) {
                    clsArr[i7] = (Class) this.f29326d.invoke(objArr[i7], new Object[0]);
                }
                return cls.getDeclaredConstructor(clsArr);
            } catch (ReflectiveOperationException e7) {
                throw AbstractC7359a.m32397d(e7);
            }
        }

        @Override // p383w5.AbstractC7359a.b
        /* JADX INFO: renamed from: c */
        String[] mo32412c(Class cls) {
            try {
                Object[] objArr = (Object[]) this.f29324b.invoke(cls, new Object[0]);
                String[] strArr = new String[objArr.length];
                for (int i7 = 0; i7 < objArr.length; i7++) {
                    strArr[i7] = (String) this.f29325c.invoke(objArr[i7], new Object[0]);
                }
                return strArr;
            } catch (ReflectiveOperationException e7) {
                throw AbstractC7359a.m32397d(e7);
            }
        }

        @Override // p383w5.AbstractC7359a.b
        /* JADX INFO: renamed from: d */
        boolean mo32413d(Class cls) {
            try {
                return ((Boolean) this.f29323a.invoke(cls, new Object[0])).booleanValue();
            } catch (ReflectiveOperationException e7) {
                throw AbstractC7359a.m32397d(e7);
            }
        }

        private d() throws ClassNotFoundException {
            super();
            this.f29323a = Class.class.getMethod("isRecord", new Class[0]);
            this.f29324b = Class.class.getMethod("getRecordComponents", new Class[0]);
            Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
            this.f29325c = cls.getMethod("getName", new Class[0]);
            this.f29326d = cls.getMethod("getType", new Class[0]);
        }
    }

    static {
        b cVar;
        try {
            cVar = new d();
        } catch (ReflectiveOperationException unused) {
            cVar = new c();
        }
        f29322a = cVar;
    }

    /* JADX INFO: renamed from: b */
    private static void m32395b(AccessibleObject accessibleObject, StringBuilder sb) {
        sb.append('(');
        Class<?>[] parameterTypes = accessibleObject instanceof Method ? ((Method) accessibleObject).getParameterTypes() : ((Constructor) accessibleObject).getParameterTypes();
        for (int i7 = 0; i7 < parameterTypes.length; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            sb.append(parameterTypes[i7].getSimpleName());
        }
        sb.append(')');
    }

    /* JADX INFO: renamed from: c */
    public static String m32396c(Constructor constructor) {
        StringBuilder sb = new StringBuilder(constructor.getDeclaringClass().getName());
        m32395b(constructor, sb);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static RuntimeException m32397d(ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", reflectiveOperationException);
    }

    /* JADX INFO: renamed from: e */
    public static RuntimeException m32398e(IllegalAccessException illegalAccessException) {
        throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", illegalAccessException);
    }

    /* JADX INFO: renamed from: f */
    public static String m32399f(Field field) {
        return field.getDeclaringClass().getName() + "#" + field.getName();
    }

    /* JADX INFO: renamed from: g */
    public static String m32400g(AccessibleObject accessibleObject, boolean z7) {
        String str;
        if (accessibleObject instanceof Field) {
            str = "field '" + m32399f((Field) accessibleObject) + "'";
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb = new StringBuilder(method.getName());
            m32395b(method, sb);
            str = "method '" + method.getDeclaringClass().getName() + "#" + sb.toString() + "'";
        } else if (accessibleObject instanceof Constructor) {
            str = "constructor '" + m32396c((Constructor) accessibleObject) + "'";
        } else {
            str = "<unknown AccessibleObject> " + accessibleObject.toString();
        }
        if (!z7 || !Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    /* JADX INFO: renamed from: h */
    public static Method m32401h(Class cls, Field field) {
        return f29322a.mo32410a(cls, field);
    }

    /* JADX INFO: renamed from: i */
    public static Constructor m32402i(Class cls) {
        return f29322a.mo32411b(cls);
    }

    /* JADX INFO: renamed from: j */
    private static String m32403j(Exception exc) {
        if (!exc.getClass().getName().equals("java.lang.reflect.InaccessibleObjectException")) {
            return "";
        }
        String message = exc.getMessage();
        return "\nSee " + AbstractC7168G.m31678a((message == null || !message.contains("to module com.google.gson")) ? "reflection-inaccessible" : "reflection-inaccessible-to-module-gson");
    }

    /* JADX INFO: renamed from: k */
    public static String[] m32404k(Class cls) {
        return f29322a.mo32412c(cls);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m32405l(Class cls) {
        if (m32407n(cls)) {
            return false;
        }
        return cls.isAnonymousClass() || cls.isLocalClass();
    }

    /* JADX INFO: renamed from: m */
    public static boolean m32406m(Class cls) {
        return f29322a.mo32413d(cls);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m32407n(Class cls) {
        return Modifier.isStatic(cls.getModifiers());
    }

    /* JADX INFO: renamed from: o */
    public static void m32408o(AccessibleObject accessibleObject) {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e7) {
            throw new C5029h("Failed making " + m32400g(accessibleObject, false) + " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type." + m32403j(e7), e7);
        }
    }

    /* JADX INFO: renamed from: p */
    public static String m32409p(Constructor constructor) {
        try {
            constructor.setAccessible(true);
            return null;
        } catch (Exception e7) {
            return "Failed making constructor '" + m32396c(constructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e7.getMessage() + m32403j(e7);
        }
    }
}
