package com.google.gson.reflect;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Objects;
import p367u5.AbstractC7168G;
import p367u5.AbstractC7191v;

/* JADX INFO: renamed from: com.google.gson.reflect.a */
/* JADX INFO: loaded from: classes.dex */
public class C5058a<T> {

    /* JADX INFO: renamed from: a */
    private final Class f19250a;

    /* JADX INFO: renamed from: b */
    private final Type f19251b;

    /* JADX INFO: renamed from: c */
    private final int f19252c;

    protected C5058a() {
        Type typeM22811e = m22811e();
        this.f19251b = typeM22811e;
        this.f19250a = AbstractC7191v.m31729k(typeM22811e);
        this.f19252c = typeM22811e.hashCode();
    }

    /* JADX INFO: renamed from: a */
    public static C5058a m22809a(Class cls) {
        return new C5058a(cls);
    }

    /* JADX INFO: renamed from: b */
    public static C5058a m22810b(Type type) {
        return new C5058a(type);
    }

    /* JADX INFO: renamed from: e */
    private Type m22811e() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == C5058a.class) {
                Type typeM31720b = AbstractC7191v.m31720b(parameterizedType.getActualTypeArguments()[0]);
                if (m22812f()) {
                    m22813g(typeM31720b);
                }
                return typeM31720b;
            }
        } else if (genericSuperclass == C5058a.class) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.\nSee " + AbstractC7168G.m31678a("type-token-raw"));
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    /* JADX INFO: renamed from: f */
    private static boolean m22812f() {
        return !Objects.equals(System.getProperty("gson.allowCapturingTypeVariables"), "true");
    }

    /* JADX INFO: renamed from: g */
    private static void m22813g(Type type) {
        if (type instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type;
            throw new IllegalArgumentException("TypeToken type argument must not contain a type variable; captured type variable " + typeVariable.getName() + " declared by " + typeVariable.getGenericDeclaration() + "\nSee " + AbstractC7168G.m31678a("typetoken-type-variable"));
        }
        if (type instanceof GenericArrayType) {
            m22813g(((GenericArrayType) type).getGenericComponentType());
            return;
        }
        int i7 = 0;
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType != null) {
                m22813g(ownerType);
            }
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            while (i7 < length) {
                m22813g(actualTypeArguments[i7]);
                i7++;
            }
            return;
        }
        if (!(type instanceof WildcardType)) {
            if (type == null) {
                throw new IllegalArgumentException("TypeToken captured `null` as type argument; probably a compiler / runtime bug");
            }
            return;
        }
        WildcardType wildcardType = (WildcardType) type;
        for (Type type2 : wildcardType.getLowerBounds()) {
            m22813g(type2);
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        int length2 = upperBounds.length;
        while (i7 < length2) {
            m22813g(upperBounds[i7]);
            i7++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final Class m22814c() {
        return this.f19250a;
    }

    /* JADX INFO: renamed from: d */
    public final Type m22815d() {
        return this.f19251b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C5058a) && AbstractC7191v.m31724f(this.f19251b, ((C5058a) obj).f19251b);
    }

    public final int hashCode() {
        return this.f19252c;
    }

    public final String toString() {
        return AbstractC7191v.m31739u(this.f19251b);
    }

    private C5058a(Type type) {
        Objects.requireNonNull(type);
        Type typeM31720b = AbstractC7191v.m31720b(type);
        this.f19251b = typeM31720b;
        this.f19250a = AbstractC7191v.m31729k(typeM31720b);
        this.f19252c = typeM31720b.hashCode();
    }
}
