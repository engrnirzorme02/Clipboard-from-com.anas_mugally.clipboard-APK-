package androidx.work;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p112O0.AbstractC1095h;

/* JADX INFO: loaded from: classes.dex */
public final class ArrayCreatingInputMerger extends AbstractC1095h {
    /* JADX INFO: renamed from: c */
    private Object m14457c(Object obj, Object obj2) {
        int length = Array.getLength(obj);
        Object objNewInstance = Array.newInstance(obj2.getClass(), length + 1);
        System.arraycopy(obj, 0, objNewInstance, 0, length);
        Array.set(objNewInstance, length, obj2);
        return objNewInstance;
    }

    /* JADX INFO: renamed from: d */
    private Object m14458d(Object obj, Object obj2) {
        int length = Array.getLength(obj);
        int length2 = Array.getLength(obj2);
        Object objNewInstance = Array.newInstance(obj.getClass().getComponentType(), length + length2);
        System.arraycopy(obj, 0, objNewInstance, 0, length);
        System.arraycopy(obj2, 0, objNewInstance, length, length2);
        return objNewInstance;
    }

    /* JADX INFO: renamed from: e */
    private Object m14459e(Object obj, Object obj2) {
        Object objNewInstance = Array.newInstance(obj.getClass(), 2);
        Array.set(objNewInstance, 0, obj);
        Array.set(objNewInstance, 1, obj2);
        return objNewInstance;
    }

    /* JADX INFO: renamed from: f */
    private Object m14460f(Object obj) {
        Object objNewInstance = Array.newInstance(obj.getClass(), 1);
        Array.set(objNewInstance, 0, obj);
        return objNewInstance;
    }

    @Override // p112O0.AbstractC1095h
    /* JADX INFO: renamed from: b */
    public C2896b mo4840b(List list) {
        C2896b.a aVar = new C2896b.a();
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((C2896b) it.next()).m14502h().entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                Class<?> cls = value.getClass();
                Object obj = map.get(str);
                if (obj != null) {
                    Class<?> cls2 = obj.getClass();
                    if (cls2.equals(cls)) {
                        value = cls2.isArray() ? m14458d(obj, value) : m14459e(obj, value);
                    } else if (cls2.isArray() && cls2.getComponentType().equals(cls)) {
                        value = m14457c(obj, value);
                    } else {
                        if (!cls.isArray() || !cls.getComponentType().equals(cls2)) {
                            throw new IllegalArgumentException();
                        }
                        value = m14457c(value, obj);
                    }
                } else if (!cls.isArray()) {
                    value = m14460f(value);
                }
                map.put(str, value);
            }
        }
        aVar.m14507c(map);
        return aVar.m14505a();
    }
}
