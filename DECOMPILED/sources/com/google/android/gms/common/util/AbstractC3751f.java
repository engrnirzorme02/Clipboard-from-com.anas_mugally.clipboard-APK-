package com.google.android.gms.common.util;

import androidx.collection.C2390a;
import androidx.collection.C2391b;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.common.util.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3751f {
    /* JADX INFO: renamed from: a */
    public static List m18162a(Object obj) {
        return Collections.singletonList(obj);
    }

    /* JADX INFO: renamed from: b */
    public static List m18163b(Object... objArr) {
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? Collections.unmodifiableList(Arrays.asList(objArr)) : Collections.singletonList(objArr[0]);
        }
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: c */
    public static Map m18164c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Map mapM18168g = m18168g(3, false);
        mapM18168g.put(obj, obj2);
        mapM18168g.put(obj3, obj4);
        mapM18168g.put(obj5, obj6);
        return Collections.unmodifiableMap(mapM18168g);
    }

    /* JADX INFO: renamed from: d */
    public static Map m18165d(Object[] objArr, Object[] objArr2) {
        int length = objArr.length;
        int length2 = objArr2.length;
        if (length != length2) {
            throw new IllegalArgumentException("Key and values array lengths not equal: " + length + " != " + length2);
        }
        if (length == 0) {
            return Collections.EMPTY_MAP;
        }
        if (length == 1) {
            return Collections.singletonMap(objArr[0], objArr2[0]);
        }
        Map mapM18168g = m18168g(length, false);
        for (int i7 = 0; i7 < objArr.length; i7++) {
            mapM18168g.put(objArr[i7], objArr2[i7]);
        }
        return Collections.unmodifiableMap(mapM18168g);
    }

    /* JADX INFO: renamed from: e */
    public static Set m18166e(Object obj, Object obj2, Object obj3) {
        Set setM18169h = m18169h(3, false);
        setM18169h.add(obj);
        setM18169h.add(obj2);
        setM18169h.add(obj3);
        return Collections.unmodifiableSet(setM18169h);
    }

    /* JADX INFO: renamed from: f */
    public static Set m18167f(Object... objArr) {
        int length = objArr.length;
        if (length == 0) {
            return Collections.EMPTY_SET;
        }
        if (length == 1) {
            return Collections.singleton(objArr[0]);
        }
        if (length == 2) {
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            Set setM18169h = m18169h(2, false);
            setM18169h.add(obj);
            setM18169h.add(obj2);
            return Collections.unmodifiableSet(setM18169h);
        }
        if (length == 3) {
            return m18166e(objArr[0], objArr[1], objArr[2]);
        }
        if (length != 4) {
            Set setM18169h2 = m18169h(length, false);
            Collections.addAll(setM18169h2, objArr);
            return Collections.unmodifiableSet(setM18169h2);
        }
        Object obj3 = objArr[0];
        Object obj4 = objArr[1];
        Object obj5 = objArr[2];
        Object obj6 = objArr[3];
        Set setM18169h3 = m18169h(4, false);
        setM18169h3.add(obj3);
        setM18169h3.add(obj4);
        setM18169h3.add(obj5);
        setM18169h3.add(obj6);
        return Collections.unmodifiableSet(setM18169h3);
    }

    /* JADX INFO: renamed from: g */
    private static Map m18168g(int i7, boolean z7) {
        return i7 <= 256 ? new C2390a(i7) : new HashMap(i7, 1.0f);
    }

    /* JADX INFO: renamed from: h */
    private static Set m18169h(int i7, boolean z7) {
        if (i7 <= (true != z7 ? 256 : 128)) {
            return new C2391b(i7);
        }
        return new HashSet(i7, true != z7 ? 1.0f : 0.75f);
    }
}
