package androidx.collection;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.C1444v;
import p152T5.AbstractC1638q;
import p353t.C7066b;
import p353t.C7067c;

/* JADX INFO: renamed from: androidx.collection.j */
/* JADX INFO: loaded from: classes.dex */
public class C2399j {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final C7066b lock;
    private final C7067c map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public C2399j(int i7) {
        this.maxSize = i7;
        if (i7 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.map = new C7067c(0, 0.75f);
        this.lock = new C7066b();
    }

    /* JADX INFO: renamed from: a */
    private final int m10294a(Object obj, Object obj2) {
        int iSizeOf = sizeOf(obj, obj2);
        if (iSizeOf >= 0) {
            return iSizeOf;
        }
        throw new IllegalStateException(("Negative size: " + obj + '=' + obj2).toString());
    }

    protected Object create(Object key) {
        AbstractC6118n.m27187e(key, "key");
        return null;
    }

    public final int createCount() {
        int i7;
        synchronized (this.lock) {
            i7 = this.createCount;
        }
        return i7;
    }

    protected void entryRemoved(boolean z7, Object key, Object oldValue, Object obj) {
        AbstractC6118n.m27187e(key, "key");
        AbstractC6118n.m27187e(oldValue, "oldValue");
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i7;
        synchronized (this.lock) {
            i7 = this.evictionCount;
        }
        return i7;
    }

    public final Object get(Object key) {
        Object objM31163d;
        AbstractC6118n.m27187e(key, "key");
        synchronized (this.lock) {
            Object objM31160a = this.map.m31160a(key);
            if (objM31160a != null) {
                this.hitCount++;
                return objM31160a;
            }
            this.missCount++;
            Object objCreate = create(key);
            if (objCreate == null) {
                return null;
            }
            synchronized (this.lock) {
                try {
                    this.createCount++;
                    objM31163d = this.map.m31163d(key, objCreate);
                    if (objM31163d != null) {
                        this.map.m31163d(key, objM31163d);
                    } else {
                        this.size += m10294a(key, objCreate);
                        C1444v c1444v = C1444v.f4971a;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (objM31163d != null) {
                entryRemoved(false, key, objCreate, objM31163d);
                return objM31163d;
            }
            trimToSize(this.maxSize);
            return objCreate;
        }
    }

    public final int hitCount() {
        int i7;
        synchronized (this.lock) {
            i7 = this.hitCount;
        }
        return i7;
    }

    public final int maxSize() {
        int i7;
        synchronized (this.lock) {
            i7 = this.maxSize;
        }
        return i7;
    }

    public final int missCount() {
        int i7;
        synchronized (this.lock) {
            i7 = this.missCount;
        }
        return i7;
    }

    public final Object put(Object key, Object value) {
        Object objM31163d;
        AbstractC6118n.m27187e(key, "key");
        AbstractC6118n.m27187e(value, "value");
        synchronized (this.lock) {
            try {
                this.putCount++;
                this.size += m10294a(key, value);
                objM31163d = this.map.m31163d(key, value);
                if (objM31163d != null) {
                    this.size -= m10294a(key, objM31163d);
                }
                C1444v c1444v = C1444v.f4971a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (objM31163d != null) {
            entryRemoved(false, key, objM31163d, value);
        }
        trimToSize(this.maxSize);
        return objM31163d;
    }

    public final int putCount() {
        int i7;
        synchronized (this.lock) {
            i7 = this.putCount;
        }
        return i7;
    }

    public final Object remove(Object key) {
        Object objM31164e;
        AbstractC6118n.m27187e(key, "key");
        synchronized (this.lock) {
            try {
                objM31164e = this.map.m31164e(key);
                if (objM31164e != null) {
                    this.size -= m10294a(key, objM31164e);
                }
                C1444v c1444v = C1444v.f4971a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (objM31164e != null) {
            entryRemoved(false, key, objM31164e, null);
        }
        return objM31164e;
    }

    public void resize(int i7) {
        if (i7 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        synchronized (this.lock) {
            this.maxSize = i7;
            C1444v c1444v = C1444v.f4971a;
        }
        trimToSize(i7);
    }

    public final int size() {
        int i7;
        synchronized (this.lock) {
            i7 = this.size;
        }
        return i7;
    }

    protected int sizeOf(Object key, Object value) {
        AbstractC6118n.m27187e(key, "key");
        AbstractC6118n.m27187e(value, "value");
        return 1;
    }

    public final Map<Object, Object> snapshot() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (this.lock) {
            try {
                for (Map.Entry entry : this.map.m31161b()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                C1444v c1444v = C1444v.f4971a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return linkedHashMap;
    }

    public String toString() {
        String str;
        synchronized (this.lock) {
            try {
                int i7 = this.hitCount;
                int i8 = this.missCount + i7;
                str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i8 != 0 ? (i7 * 100) / i8 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public void trimToSize(int i7) {
        Object key;
        Object value;
        while (true) {
            synchronized (this.lock) {
                try {
                    if (this.size < 0 || (this.map.m31162c() && this.size != 0)) {
                        break;
                    }
                    if (this.size > i7 && !this.map.m31162c()) {
                        Map.Entry entry = (Map.Entry) AbstractC1638q.m6571K(this.map.m31161b());
                        if (entry == null) {
                            return;
                        }
                        key = entry.getKey();
                        value = entry.getValue();
                        this.map.m31164e(key);
                        this.size -= m10294a(key, value);
                        this.evictionCount++;
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
            entryRemoved(true, key, value, null);
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }
}
