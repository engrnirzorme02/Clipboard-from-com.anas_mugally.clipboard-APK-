package p406z4;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p334q4.C6835b;
import p334q4.InterfaceC6837d;
import p334q4.InterfaceC6838e;
import p334q4.InterfaceC6839f;
import p334q4.InterfaceC6840g;
import p398y4.AbstractC7551l;

/* JADX INFO: renamed from: z4.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7613a {

    /* JADX INFO: renamed from: a */
    private static final ConcurrentMap f30288a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: z4.a$a */
    private static class a {

        /* JADX INFO: renamed from: a */
        private final Class f30289a;

        /* JADX INFO: renamed from: b */
        private final Constructor f30290b;

        /* JADX INFO: renamed from: c */
        private final boolean f30291c;

        /* JADX INFO: renamed from: d */
        private final boolean f30292d;

        /* JADX INFO: renamed from: e */
        private final Map f30293e = new HashMap();

        /* JADX INFO: renamed from: g */
        private final Map f30295g = new HashMap();

        /* JADX INFO: renamed from: f */
        private final Map f30294f = new HashMap();

        /* JADX INFO: renamed from: h */
        private final Map f30296h = new HashMap();

        public a(Class cls) {
            Constructor declaredConstructor;
            this.f30289a = cls;
            this.f30291c = cls.isAnnotationPresent(InterfaceC6840g.class);
            this.f30292d = !cls.isAnnotationPresent(InterfaceC6838e.class);
            try {
                declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                declaredConstructor = null;
            }
            this.f30290b = declaredConstructor;
            for (Method method : cls.getMethods()) {
                if (m33382i(method)) {
                    String strM33379e = m33379e(method);
                    m33375a(strM33379e);
                    method.setAccessible(true);
                    if (this.f30294f.containsKey(strM33379e)) {
                        throw new C6835b("Found conflicting getters for name: " + method.getName());
                    }
                    this.f30294f.put(strM33379e, method);
                }
            }
            for (Field field : cls.getFields()) {
                if (m33381h(field)) {
                    m33375a(m33378d(field));
                }
            }
            HashMap map = new HashMap();
            Class superclass = cls;
            do {
                for (Method method2 : superclass.getDeclaredMethods()) {
                    if (m33383j(method2)) {
                        String strM33379e2 = m33379e(method2);
                        String str = (String) this.f30293e.get(strM33379e2.toLowerCase(Locale.US));
                        if (str == null) {
                            continue;
                        } else {
                            if (!str.equals(strM33379e2)) {
                                throw new C6835b("Found setter with invalid case-sensitive name: " + method2.getName());
                            }
                            if (method2.isBridge()) {
                                map.put(strM33379e2, method2);
                            } else {
                                Method method3 = (Method) this.f30295g.get(strM33379e2);
                                Method method4 = (Method) map.get(strM33379e2);
                                if (method3 == null) {
                                    method2.setAccessible(true);
                                    this.f30295g.put(strM33379e2, method2);
                                } else if (!m33377c(method2, method3) && (method4 == null || !m33377c(method2, method4))) {
                                    throw new C6835b("Found a conflicting setters with name: " + method2.getName() + " (conflicts with " + method3.getName() + " defined on " + method3.getDeclaringClass().getName() + ")");
                                }
                            }
                        }
                    }
                }
                for (Field field2 : superclass.getDeclaredFields()) {
                    String strM33378d = m33378d(field2);
                    if (this.f30293e.containsKey(strM33378d.toLowerCase(Locale.US)) && !this.f30296h.containsKey(strM33378d)) {
                        field2.setAccessible(true);
                        this.f30296h.put(strM33378d, field2);
                    }
                }
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    break;
                }
            } while (!superclass.equals(Object.class));
            if (this.f30293e.isEmpty()) {
                throw new C6835b("No properties to serialize found on class " + cls.getName());
            }
        }

        /* JADX INFO: renamed from: a */
        private void m33375a(String str) {
            Map map = this.f30293e;
            Locale locale = Locale.US;
            String str2 = (String) map.put(str.toLowerCase(locale), str);
            if (str2 == null || str.equals(str2)) {
                return;
            }
            throw new C6835b("Found two getters or fields with conflicting case sensitivity for property: " + str.toLowerCase(locale));
        }

        /* JADX INFO: renamed from: b */
        private static String m33376b(AccessibleObject accessibleObject) {
            if (accessibleObject.isAnnotationPresent(InterfaceC6839f.class)) {
                return ((InterfaceC6839f) accessibleObject.getAnnotation(InterfaceC6839f.class)).value();
            }
            return null;
        }

        /* JADX INFO: renamed from: c */
        private static boolean m33377c(Method method, Method method2) {
            AbstractC7551l.m33234g(method.getDeclaringClass().isAssignableFrom(method2.getDeclaringClass()), "Expected override from a base class");
            Class<?> returnType = method.getReturnType();
            Class cls = Void.TYPE;
            AbstractC7551l.m33234g(returnType.equals(cls), "Expected void return type");
            AbstractC7551l.m33234g(method2.getReturnType().equals(cls), "Expected void return type");
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?>[] parameterTypes2 = method2.getParameterTypes();
            AbstractC7551l.m33234g(parameterTypes.length == 1, "Expected exactly one parameter");
            AbstractC7551l.m33234g(parameterTypes2.length == 1, "Expected exactly one parameter");
            return method.getName().equals(method2.getName()) && parameterTypes[0].equals(parameterTypes2[0]);
        }

        /* JADX INFO: renamed from: d */
        private static String m33378d(Field field) {
            String strM33376b = m33376b(field);
            return strM33376b != null ? strM33376b : field.getName();
        }

        /* JADX INFO: renamed from: e */
        private static String m33379e(Method method) {
            String strM33376b = m33376b(method);
            return strM33376b != null ? strM33376b : m33380g(method.getName());
        }

        /* JADX INFO: renamed from: g */
        private static String m33380g(String str) {
            String[] strArr = {"get", "set", "is"};
            String str2 = null;
            for (int i7 = 0; i7 < 3; i7++) {
                String str3 = strArr[i7];
                if (str.startsWith(str3)) {
                    str2 = str3;
                }
            }
            if (str2 == null) {
                throw new IllegalArgumentException("Unknown Bean prefix for method: " + str);
            }
            char[] charArray = str.substring(str2.length()).toCharArray();
            for (int i8 = 0; i8 < charArray.length && Character.isUpperCase(charArray[i8]); i8++) {
                charArray[i8] = Character.toLowerCase(charArray[i8]);
            }
            return new String(charArray);
        }

        /* JADX INFO: renamed from: h */
        private static boolean m33381h(Field field) {
            return (field.getDeclaringClass().equals(Object.class) || !Modifier.isPublic(field.getModifiers()) || Modifier.isStatic(field.getModifiers()) || Modifier.isTransient(field.getModifiers()) || field.isAnnotationPresent(InterfaceC6837d.class)) ? false : true;
        }

        /* JADX INFO: renamed from: i */
        private static boolean m33382i(Method method) {
            return ((!method.getName().startsWith("get") && !method.getName().startsWith("is")) || method.getDeclaringClass().equals(Object.class) || !Modifier.isPublic(method.getModifiers()) || Modifier.isStatic(method.getModifiers()) || method.getReturnType().equals(Void.TYPE) || method.getParameterTypes().length != 0 || method.isBridge() || method.isAnnotationPresent(InterfaceC6837d.class)) ? false : true;
        }

        /* JADX INFO: renamed from: j */
        private static boolean m33383j(Method method) {
            return method.getName().startsWith("set") && !method.getDeclaringClass().equals(Object.class) && !Modifier.isStatic(method.getModifiers()) && method.getReturnType().equals(Void.TYPE) && method.getParameterTypes().length == 1 && !method.isAnnotationPresent(InterfaceC6837d.class);
        }

        /* JADX INFO: renamed from: f */
        public Map m33384f(Object obj) {
            Object objInvoke;
            if (!this.f30289a.isAssignableFrom(obj.getClass())) {
                throw new IllegalArgumentException("Can't serialize object of class " + obj.getClass() + " with BeanMapper for class " + this.f30289a);
            }
            HashMap map = new HashMap();
            for (String str : this.f30293e.values()) {
                if (this.f30294f.containsKey(str)) {
                    try {
                        objInvoke = ((Method) this.f30294f.get(str)).invoke(obj, new Object[0]);
                    } catch (IllegalAccessException e7) {
                        throw new RuntimeException(e7);
                    } catch (InvocationTargetException e8) {
                        throw new RuntimeException(e8);
                    }
                } else {
                    Field field = (Field) this.f30296h.get(str);
                    if (field == null) {
                        throw new IllegalStateException("Bean property without field or getter:" + str);
                    }
                    try {
                        objInvoke = field.get(obj);
                    } catch (IllegalAccessException e9) {
                        throw new RuntimeException(e9);
                    }
                }
                map.put(str, AbstractC7613a.m33374d(objInvoke));
            }
            return map;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Object m33372b(Object obj) {
        return m33374d(obj);
    }

    /* JADX INFO: renamed from: c */
    private static a m33373c(Class cls) {
        ConcurrentMap concurrentMap = f30288a;
        a aVar = (a) concurrentMap.get(cls);
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(cls);
        concurrentMap.put(cls, aVar2);
        return aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static Object m33374d(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            if ((obj instanceof Float) || (obj instanceof Double)) {
                Number number = (Number) obj;
                double dDoubleValue = number.doubleValue();
                return (dDoubleValue > 9.223372036854776E18d || dDoubleValue < -9.223372036854776E18d || Math.floor(dDoubleValue) != dDoubleValue) ? Double.valueOf(dDoubleValue) : Long.valueOf(number.longValue());
            }
            if ((obj instanceof Long) || (obj instanceof Integer)) {
                return obj;
            }
            throw new C6835b(String.format("Numbers of type %s are not supported, please use an int, long, float or double", obj.getClass().getSimpleName()));
        }
        if ((obj instanceof String) || (obj instanceof Boolean)) {
            return obj;
        }
        if (obj instanceof Character) {
            throw new C6835b("Characters are not supported, please use Strings");
        }
        if (obj instanceof Map) {
            HashMap map = new HashMap();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                if (!(key instanceof String)) {
                    throw new C6835b("Maps with non-string keys are not supported");
                }
                map.put((String) key, m33374d(entry.getValue()));
            }
            return map;
        }
        if (!(obj instanceof Collection)) {
            if (obj.getClass().isArray()) {
                throw new C6835b("Serializing Arrays is not supported, please use Lists instead");
            }
            return obj instanceof Enum ? ((Enum) obj).name() : m33373c(obj.getClass()).m33384f(obj);
        }
        if (!(obj instanceof List)) {
            throw new C6835b("Serializing Collections is not supported, please use Lists instead");
        }
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m33374d(it.next()));
        }
        return arrayList;
    }
}
