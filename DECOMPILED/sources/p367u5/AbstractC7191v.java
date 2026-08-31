package p367u5;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Properties;

/* JADX INFO: renamed from: u5.v */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7191v {

    /* JADX INFO: renamed from: a */
    static final Type[] f28670a = new Type[0];

    /* JADX INFO: renamed from: u5.v$a */
    private static final class a implements GenericArrayType, Serializable {

        /* JADX INFO: renamed from: a */
        private final Type f28671a;

        a(Type type) {
            Objects.requireNonNull(type);
            this.f28671a = AbstractC7191v.m31720b(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && AbstractC7191v.m31724f(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f28671a;
        }

        public int hashCode() {
            return this.f28671a.hashCode();
        }

        public String toString() {
            return AbstractC7191v.m31739u(this.f28671a) + "[]";
        }
    }

    /* JADX INFO: renamed from: u5.v$b */
    private static final class b implements ParameterizedType, Serializable {

        /* JADX INFO: renamed from: a */
        private final Type f28672a;

        /* JADX INFO: renamed from: b */
        private final Type f28673b;

        /* JADX INFO: renamed from: c */
        private final Type[] f28674c;

        b(Type type, Class cls, Type... typeArr) {
            Objects.requireNonNull(cls);
            if (type == null && AbstractC7191v.m31733o(cls)) {
                throw new IllegalArgumentException("Must specify owner type for " + cls);
            }
            this.f28672a = type == null ? null : AbstractC7191v.m31720b(type);
            this.f28673b = AbstractC7191v.m31720b(cls);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f28674c = typeArr2;
            int length = typeArr2.length;
            for (int i7 = 0; i7 < length; i7++) {
                Objects.requireNonNull(this.f28674c[i7]);
                AbstractC7191v.m31721c(this.f28674c[i7]);
                Type[] typeArr3 = this.f28674c;
                typeArr3[i7] = AbstractC7191v.m31720b(typeArr3[i7]);
            }
        }

        /* JADX INFO: renamed from: a */
        private static int m31740a(Object obj) {
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && AbstractC7191v.m31724f(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f28674c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f28672a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f28673b;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f28674c) ^ this.f28673b.hashCode()) ^ m31740a(this.f28672a);
        }

        public String toString() {
            int length = this.f28674c.length;
            if (length == 0) {
                return AbstractC7191v.m31739u(this.f28673b);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(AbstractC7191v.m31739u(this.f28673b));
            sb.append("<");
            sb.append(AbstractC7191v.m31739u(this.f28674c[0]));
            for (int i7 = 1; i7 < length; i7++) {
                sb.append(", ");
                sb.append(AbstractC7191v.m31739u(this.f28674c[i7]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: u5.v$c */
    private static final class c implements WildcardType, Serializable {

        /* JADX INFO: renamed from: a */
        private final Type f28675a;

        /* JADX INFO: renamed from: b */
        private final Type f28676b;

        c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException("At most one lower bound is supported");
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException("Exactly one upper bound must be specified");
            }
            if (typeArr2.length != 1) {
                Objects.requireNonNull(typeArr[0]);
                AbstractC7191v.m31721c(typeArr[0]);
                this.f28676b = null;
                this.f28675a = AbstractC7191v.m31720b(typeArr[0]);
                return;
            }
            Objects.requireNonNull(typeArr2[0]);
            AbstractC7191v.m31721c(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException("When lower bound is specified, upper bound must be Object");
            }
            this.f28676b = AbstractC7191v.m31720b(typeArr2[0]);
            this.f28675a = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && AbstractC7191v.m31724f(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f28676b;
            return type != null ? new Type[]{type} : AbstractC7191v.f28670a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f28675a};
        }

        public int hashCode() {
            Type type = this.f28676b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f28675a.hashCode() + 31);
        }

        public String toString() {
            if (this.f28676b != null) {
                return "? super " + AbstractC7191v.m31739u(this.f28676b);
            }
            if (this.f28675a == Object.class) {
                return "?";
            }
            return "? extends " + AbstractC7191v.m31739u(this.f28675a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static GenericArrayType m31719a(Type type) {
        return new a(type);
    }

    /* JADX INFO: renamed from: b */
    public static Type m31720b(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new a(m31720b(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), (Class) parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new a(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    /* JADX INFO: renamed from: c */
    static void m31721c(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException("Primitive type is not allowed");
        }
    }

    /* JADX INFO: renamed from: d */
    private static Class m31722d(TypeVariable typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    private static boolean m31723e(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m31724f(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return m31723e(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return m31724f(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return Objects.equals(typeVariable.getGenericDeclaration(), typeVariable2.getGenericDeclaration()) && typeVariable.getName().equals(typeVariable2.getName());
    }

    /* JADX INFO: renamed from: g */
    public static Type m31725g(Type type) {
        return type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
    }

    /* JADX INFO: renamed from: h */
    public static Type m31726h(Type type, Class cls) {
        Type typeM31730l = m31730l(type, cls, Collection.class);
        return typeM31730l instanceof ParameterizedType ? ((ParameterizedType) typeM31730l).getActualTypeArguments()[0] : Object.class;
    }

    /* JADX INFO: renamed from: i */
    private static Type m31727i(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i7 = 0; i7 < length; i7++) {
                Class<?> cls3 = interfaces[i7];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i7];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return m31727i(cls.getGenericInterfaces()[i7], interfaces[i7], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m31727i(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* JADX INFO: renamed from: j */
    public static Type[] m31728j(Type type, Class cls) {
        if (Properties.class.isAssignableFrom(cls)) {
            return new Type[]{String.class, String.class};
        }
        Type typeM31730l = m31730l(type, cls, Map.class);
        return typeM31730l instanceof ParameterizedType ? ((ParameterizedType) typeM31730l).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    /* JADX INFO: renamed from: k */
    public static Class m31729k(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) m31729k(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m31729k(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    /* JADX INFO: renamed from: l */
    private static Type m31730l(Type type, Class cls, Class cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        if (cls2.isAssignableFrom(cls)) {
            return m31734p(type, cls, m31727i(type, cls, cls2));
        }
        throw new IllegalArgumentException(cls + " is not the same as or a subtype of " + cls2);
    }

    /* JADX INFO: renamed from: m */
    private static int m31731m(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (obj.equals(objArr[i7])) {
                return i7;
            }
        }
        throw new NoSuchElementException();
    }

    /* JADX INFO: renamed from: n */
    public static ParameterizedType m31732n(Type type, Class cls, Type... typeArr) {
        return new b(type, cls, typeArr);
    }

    /* JADX INFO: renamed from: o */
    public static boolean m31733o(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (!Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public static Type m31734p(Type type, Class cls, Type type2) {
        return m31735q(type, cls, type2, new HashMap());
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0064  */
    /* JADX WARN: Code duplicated, block: B:33:0x006a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0081  */
    /* JADX WARN: Code duplicated, block: B:37:0x008f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0091  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00be  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c8 A[EDGE_INSN: B:50:0x00c8->B:56:0x00de BREAK  A[LOOP:0: B:3:0x0001->B:62:?]] */
    /* JADX WARN: Code duplicated, block: B:51:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:65:0x009b A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX INFO: renamed from: q */
    private static Type m31735q(Type type, Class cls, Type type2, Map map) {
        int i7;
        Type[] lowerBounds;
        Type[] upperBounds;
        Type typeM31735q;
        Type typeM31735q2;
        boolean zM31723e;
        int length;
        Type[] typeArr;
        boolean z7;
        Type typeM31732n;
        Type typeM31735q3;
        Type genericComponentType;
        Type typeM31735q4;
        TypeVariable typeVariable;
        TypeVariable typeVariable2 = null;
        do {
            if (!(type2 instanceof TypeVariable)) {
                if (!(type2 instanceof Class)) {
                    if (type2 instanceof GenericArrayType) {
                        if (type2 instanceof ParameterizedType) {
                            if (type2 instanceof WildcardType) {
                                break;
                            }
                            type2 = (WildcardType) type2;
                            lowerBounds = type2.getLowerBounds();
                            upperBounds = type2.getUpperBounds();
                            if (lowerBounds.length == 1) {
                                if (upperBounds.length != 1) {
                                    break;
                                }
                                type2 = m31737s(typeM31735q);
                                break;
                            }
                            typeM31735q2 = m31735q(type, cls, lowerBounds[0], map);
                            if (typeM31735q2 != lowerBounds[0]) {
                                break;
                            }
                            type2 = m31738t(typeM31735q2);
                            break;
                        }
                        type2 = (ParameterizedType) type2;
                        Type ownerType = type2.getOwnerType();
                        Type typeM31735q5 = m31735q(type, cls, ownerType, map);
                        zM31723e = m31723e(typeM31735q5, ownerType);
                        Type[] actualTypeArguments = type2.getActualTypeArguments();
                        length = actualTypeArguments.length;
                        typeArr = actualTypeArguments;
                        z7 = false;
                        for (i7 = 0; i7 < length; i7++) {
                            typeM31735q3 = m31735q(type, cls, typeArr[i7], map);
                            if (m31723e(typeM31735q3, typeArr[i7])) {
                                if (!z7) {
                                    typeArr = (Type[]) typeArr.clone();
                                    z7 = true;
                                }
                                typeArr[i7] = typeM31735q3;
                            }
                        }
                        if (!zM31723e) {
                        }
                        typeM31732n = m31732n(typeM31735q5, (Class) type2.getRawType(), typeArr);
                        type2 = typeM31732n;
                        break;
                    }
                    type2 = (GenericArrayType) type2;
                    genericComponentType = type2.getGenericComponentType();
                    typeM31735q4 = m31735q(type, cls, genericComponentType, map);
                    if (m31723e(genericComponentType, typeM31735q4)) {
                        typeM31732n = m31719a(typeM31735q4);
                        type2 = typeM31732n;
                        break;
                    }
                    break;
                }
                Class cls2 = (Class) type2;
                if (!cls2.isArray()) {
                    if (type2 instanceof GenericArrayType) {
                        if (type2 instanceof ParameterizedType) {
                            if (type2 instanceof WildcardType) {
                                break;
                            }
                            type2 = (WildcardType) type2;
                            lowerBounds = type2.getLowerBounds();
                            upperBounds = type2.getUpperBounds();
                            if (lowerBounds.length == 1) {
                                if (upperBounds.length != 1 && (typeM31735q = m31735q(type, cls, upperBounds[0], map)) != upperBounds[0]) {
                                    type2 = m31737s(typeM31735q);
                                    break;
                                }
                                break;
                                break;
                            }
                            typeM31735q2 = m31735q(type, cls, lowerBounds[0], map);
                            if (typeM31735q2 != lowerBounds[0]) {
                                break;
                            }
                            type2 = m31738t(typeM31735q2);
                            break;
                        }
                        type2 = (ParameterizedType) type2;
                        Type ownerType2 = type2.getOwnerType();
                        Type typeM31735q6 = m31735q(type, cls, ownerType2, map);
                        zM31723e = m31723e(typeM31735q6, ownerType2);
                        Type[] actualTypeArguments2 = type2.getActualTypeArguments();
                        length = actualTypeArguments2.length;
                        typeArr = actualTypeArguments2;
                        z7 = false;
                        while (i7 < length) {
                            typeM31735q3 = m31735q(type, cls, typeArr[i7], map);
                            if (m31723e(typeM31735q3, typeArr[i7])) {
                                if (!z7) {
                                    typeArr = (Type[]) typeArr.clone();
                                    z7 = true;
                                }
                                typeArr[i7] = typeM31735q3;
                            }
                        }
                        if (!zM31723e && !z7) {
                            break;
                        }
                        typeM31732n = m31732n(typeM31735q6, (Class) type2.getRawType(), typeArr);
                        type2 = typeM31732n;
                        break;
                    }
                    type2 = (GenericArrayType) type2;
                    genericComponentType = type2.getGenericComponentType();
                    typeM31735q4 = m31735q(type, cls, genericComponentType, map);
                    if (m31723e(genericComponentType, typeM31735q4)) {
                        break;
                    }
                    typeM31732n = m31719a(typeM31735q4);
                    type2 = typeM31732n;
                    break;
                }
                Class<?> componentType = cls2.getComponentType();
                Type typeM31735q7 = m31735q(type, cls, componentType, map);
                if (!m31723e(componentType, typeM31735q7)) {
                    typeM31732n = m31719a(typeM31735q7);
                    type2 = typeM31732n;
                    break;
                }
                type2 = cls2;
                break;
            }
            typeVariable = (TypeVariable) type2;
            Type type3 = (Type) map.get(typeVariable);
            Class cls3 = Void.TYPE;
            if (type3 != null) {
                return type3 == cls3 ? type2 : type3;
            }
            map.put(typeVariable, cls3);
            if (typeVariable2 == null) {
                typeVariable2 = typeVariable;
            }
            type2 = m31736r(type, cls, typeVariable);
        } while (type2 != typeVariable);
        if (typeVariable2 != null) {
            map.put(typeVariable2, type2);
        }
        return type2;
    }

    /* JADX INFO: renamed from: r */
    private static Type m31736r(Type type, Class cls, TypeVariable typeVariable) {
        Class clsM31722d = m31722d(typeVariable);
        if (clsM31722d != null) {
            Type typeM31727i = m31727i(type, cls, clsM31722d);
            if (typeM31727i instanceof ParameterizedType) {
                return ((ParameterizedType) typeM31727i).getActualTypeArguments()[m31731m(clsM31722d.getTypeParameters(), typeVariable)];
            }
        }
        return typeVariable;
    }

    /* JADX INFO: renamed from: s */
    public static WildcardType m31737s(Type type) {
        return new c(type instanceof WildcardType ? ((WildcardType) type).getUpperBounds() : new Type[]{type}, f28670a);
    }

    /* JADX INFO: renamed from: t */
    public static WildcardType m31738t(Type type) {
        return new c(new Type[]{Object.class}, type instanceof WildcardType ? ((WildcardType) type).getLowerBounds() : new Type[]{type});
    }

    /* JADX INFO: renamed from: u */
    public static String m31739u(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
