package p367u5;

import androidx.appcompat.app.AbstractC2263x;
import com.google.gson.C5029h;
import com.google.gson.EnumC5054o;
import com.google.gson.reflect.C5058a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import p383w5.AbstractC7359a;

/* JADX INFO: renamed from: u5.t */
/* JADX INFO: loaded from: classes.dex */
public final class C7189t {

    /* JADX INFO: renamed from: a */
    private final Map f28654a;

    /* JADX INFO: renamed from: b */
    private final boolean f28655b;

    /* JADX INFO: renamed from: c */
    private final List f28656c;

    public C7189t(Map map, boolean z7, List list) {
        this.f28654a = map;
        this.f28655b = z7;
        this.f28656c = list;
    }

    /* JADX INFO: renamed from: A */
    private static InterfaceC7163B m31683A(final Type type, Class cls) {
        if (EnumSet.class.isAssignableFrom(cls)) {
            return new InterfaceC7163B() { // from class: u5.s
                @Override // p367u5.InterfaceC7163B
                /* JADX INFO: renamed from: a */
                public final Object mo31666a() {
                    return C7189t.m31695k(type);
                }
            };
        }
        if (cls == EnumMap.class) {
            return new InterfaceC7163B() { // from class: u5.b
                @Override // p367u5.InterfaceC7163B
                /* JADX INFO: renamed from: a */
                public final Object mo31666a() {
                    return C7189t.m31690f(type);
                }
            };
        }
        return null;
    }

    /* JADX INFO: renamed from: B */
    private InterfaceC7163B m31684B(final Class cls) {
        if (this.f28655b) {
            return new InterfaceC7163B() { // from class: u5.q
                @Override // p367u5.InterfaceC7163B
                /* JADX INFO: renamed from: a */
                public final Object mo31666a() {
                    return C7189t.m31689e(cls);
                }
            };
        }
        final String str = "Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.";
        if (cls.getDeclaredConstructors().length == 0) {
            str = str + " Or adjust your R8 configuration to keep the no-args constructor of the class.";
        }
        return new InterfaceC7163B() { // from class: u5.r
            @Override // p367u5.InterfaceC7163B
            /* JADX INFO: renamed from: a */
            public final Object mo31666a() {
                return C7189t.m31697m(str);
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Map m31685a() {
        return new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Collection m31686b() {
        return new ArrayList();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Map m31687c() {
        return new LinkedHashMap();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Object m31688d(String str) {
        throw new C5029h(str);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Object m31689e(Class cls) {
        try {
            return AbstractC7169H.f28638a.mo31682d(cls);
        } catch (Exception e7) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e7);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Object m31690f(Type type) {
        if (!(type instanceof ParameterizedType)) {
            throw new C5029h("Invalid EnumMap type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        throw new C5029h("Invalid EnumMap type: " + type.toString());
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Map m31691g() {
        return new ConcurrentSkipListMap();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Map m31692h() {
        return new TreeMap();
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ Object m31693i(String str) {
        throw new C5029h(str);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Collection m31694j() {
        return new LinkedHashSet();
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ Object m31695k(Type type) {
        if (!(type instanceof ParameterizedType)) {
            throw new C5029h("Invalid EnumSet type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        throw new C5029h("Invalid EnumSet type: " + type.toString());
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ Object m31696l(String str) {
        throw new C5029h(str);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ Object m31697m(String str) {
        throw new C5029h(str);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ Map m31698n() {
        return new C7195z();
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ Object m31699o(String str) {
        throw new C5029h(str);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ Collection m31700p() {
        return new TreeSet();
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ Object m31701q(Constructor constructor) {
        try {
            return constructor.newInstance(new Object[0]);
        } catch (IllegalAccessException e7) {
            throw AbstractC7359a.m32398e(e7);
        } catch (InstantiationException e8) {
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC7359a.m32396c(constructor) + "' with no args", e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC7359a.m32396c(constructor) + "' with no args", e9.getCause());
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ Collection m31702r() {
        return new ArrayDeque();
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ Object m31703s(String str) {
        throw new C5029h(str);
    }

    /* JADX INFO: renamed from: t */
    static String m31704t(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: " + cls.getName();
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + AbstractC7168G.m31678a("r8-abstract-class");
    }

    /* JADX INFO: renamed from: v */
    private static boolean m31705v(Type type) {
        if (!(type instanceof ParameterizedType)) {
            return true;
        }
        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
        return actualTypeArguments.length != 0 && AbstractC7191v.m31729k(actualTypeArguments[0]) == String.class;
    }

    /* JADX INFO: renamed from: w */
    private static InterfaceC7163B m31706w(Class cls) {
        if (cls.isAssignableFrom(ArrayList.class)) {
            return new InterfaceC7163B() { // from class: u5.m
                @Override // p367u5.InterfaceC7163B
                /* JADX INFO: renamed from: a */
                public final Object mo31666a() {
                    return C7189t.m31686b();
                }
            };
        }
        if (cls.isAssignableFrom(LinkedHashSet.class)) {
            return new InterfaceC7163B() { // from class: u5.n
                @Override // p367u5.InterfaceC7163B
                /* JADX INFO: renamed from: a */
                public final Object mo31666a() {
                    return C7189t.m31694j();
                }
            };
        }
        if (cls.isAssignableFrom(TreeSet.class)) {
            return new InterfaceC7163B() { // from class: u5.o
                @Override // p367u5.InterfaceC7163B
                /* JADX INFO: renamed from: a */
                public final Object mo31666a() {
                    return C7189t.m31700p();
                }
            };
        }
        if (cls.isAssignableFrom(ArrayDeque.class)) {
            return new InterfaceC7163B() { // from class: u5.p
                @Override // p367u5.InterfaceC7163B
                /* JADX INFO: renamed from: a */
                public final Object mo31666a() {
                    return C7189t.m31702r();
                }
            };
        }
        return null;
    }

    /* JADX INFO: renamed from: x */
    private static InterfaceC7163B m31707x(Class cls, EnumC5054o enumC5054o) {
        final String strM32409p;
        if (Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        try {
            final Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            EnumC5054o enumC5054o2 = EnumC5054o.ALLOW;
            if (enumC5054o == enumC5054o2 || (AbstractC7166E.m31672a(declaredConstructor, null) && (enumC5054o != EnumC5054o.BLOCK_ALL || Modifier.isPublic(declaredConstructor.getModifiers())))) {
                return (enumC5054o != enumC5054o2 || (strM32409p = AbstractC7359a.m32409p(declaredConstructor)) == null) ? new InterfaceC7163B() { // from class: u5.j
                    @Override // p367u5.InterfaceC7163B
                    /* JADX INFO: renamed from: a */
                    public final Object mo31666a() {
                        return C7189t.m31701q(declaredConstructor);
                    }
                } : new InterfaceC7163B() { // from class: u5.i
                    @Override // p367u5.InterfaceC7163B
                    /* JADX INFO: renamed from: a */
                    public final Object mo31666a() {
                        return C7189t.m31693i(strM32409p);
                    }
                };
            }
            final String str = "Unable to invoke no-args constructor of " + cls + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.";
            return new InterfaceC7163B() { // from class: u5.h
                @Override // p367u5.InterfaceC7163B
                /* JADX INFO: renamed from: a */
                public final Object mo31666a() {
                    return C7189t.m31696l(str);
                }
            };
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: y */
    private static InterfaceC7163B m31708y(Type type, Class cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return m31706w(cls);
        }
        if (Map.class.isAssignableFrom(cls)) {
            return m31709z(type, cls);
        }
        return null;
    }

    /* JADX INFO: renamed from: z */
    private static InterfaceC7163B m31709z(Type type, Class cls) {
        if (cls.isAssignableFrom(C7195z.class) && m31705v(type)) {
            return new InterfaceC7163B() { // from class: u5.c
                @Override // p367u5.InterfaceC7163B
                /* JADX INFO: renamed from: a */
                public final Object mo31666a() {
                    return C7189t.m31698n();
                }
            };
        }
        if (cls.isAssignableFrom(LinkedHashMap.class)) {
            return new InterfaceC7163B() { // from class: u5.d
                @Override // p367u5.InterfaceC7163B
                /* JADX INFO: renamed from: a */
                public final Object mo31666a() {
                    return C7189t.m31687c();
                }
            };
        }
        if (cls.isAssignableFrom(TreeMap.class)) {
            return new InterfaceC7163B() { // from class: u5.e
                @Override // p367u5.InterfaceC7163B
                /* JADX INFO: renamed from: a */
                public final Object mo31666a() {
                    return C7189t.m31692h();
                }
            };
        }
        if (cls.isAssignableFrom(ConcurrentHashMap.class)) {
            return new InterfaceC7163B() { // from class: u5.f
                @Override // p367u5.InterfaceC7163B
                /* JADX INFO: renamed from: a */
                public final Object mo31666a() {
                    return C7189t.m31685a();
                }
            };
        }
        if (cls.isAssignableFrom(ConcurrentSkipListMap.class)) {
            return new InterfaceC7163B() { // from class: u5.g
                @Override // p367u5.InterfaceC7163B
                /* JADX INFO: renamed from: a */
                public final Object mo31666a() {
                    return C7189t.m31691g();
                }
            };
        }
        return null;
    }

    public String toString() {
        return this.f28654a.toString();
    }

    /* JADX INFO: renamed from: u */
    public InterfaceC7163B m31710u(C5058a c5058a, boolean z7) {
        Type typeM22815d = c5058a.m22815d();
        Class clsM22814c = c5058a.m22814c();
        AbstractC2263x.m9328a(this.f28654a.get(typeM22815d));
        AbstractC2263x.m9328a(this.f28654a.get(clsM22814c));
        InterfaceC7163B interfaceC7163BM31683A = m31683A(typeM22815d, clsM22814c);
        if (interfaceC7163BM31683A != null) {
            return interfaceC7163BM31683A;
        }
        EnumC5054o enumC5054oM31673b = AbstractC7166E.m31673b(this.f28656c, clsM22814c);
        InterfaceC7163B interfaceC7163BM31707x = m31707x(clsM22814c, enumC5054oM31673b);
        if (interfaceC7163BM31707x != null) {
            return interfaceC7163BM31707x;
        }
        InterfaceC7163B interfaceC7163BM31708y = m31708y(typeM22815d, clsM22814c);
        if (interfaceC7163BM31708y != null) {
            return interfaceC7163BM31708y;
        }
        final String strM31704t = m31704t(clsM22814c);
        if (strM31704t != null) {
            return new InterfaceC7163B() { // from class: u5.a
                @Override // p367u5.InterfaceC7163B
                /* JADX INFO: renamed from: a */
                public final Object mo31666a() {
                    return C7189t.m31699o(strM31704t);
                }
            };
        }
        if (!z7) {
            final String str = "Unable to create instance of " + clsM22814c + "; Register an InstanceCreator or a TypeAdapter for this type.";
            return new InterfaceC7163B() { // from class: u5.k
                @Override // p367u5.InterfaceC7163B
                /* JADX INFO: renamed from: a */
                public final Object mo31666a() {
                    return C7189t.m31688d(str);
                }
            };
        }
        if (enumC5054oM31673b == EnumC5054o.ALLOW) {
            return m31684B(clsM22814c);
        }
        final String str2 = "Unable to create instance of " + clsM22814c + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.";
        return new InterfaceC7163B() { // from class: u5.l
            @Override // p367u5.InterfaceC7163B
            /* JADX INFO: renamed from: a */
            public final Object mo31666a() {
                return C7189t.m31703s(str2);
            }
        };
    }
}
