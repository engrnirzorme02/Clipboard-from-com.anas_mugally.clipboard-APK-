package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.bumptech.glide.e */
/* JADX INFO: loaded from: classes.dex */
public class C3205e {

    /* JADX INFO: renamed from: a */
    private final Map f13721a;

    /* JADX INFO: renamed from: com.bumptech.glide.e$a */
    static final class a {

        /* JADX INFO: renamed from: a */
        private final Map f13722a = new HashMap();

        a() {
        }

        /* JADX INFO: renamed from: b */
        C3205e m17022b() {
            return new C3205e(this);
        }
    }

    C3205e(a aVar) {
        this.f13721a = Collections.unmodifiableMap(new HashMap(aVar.f13722a));
    }

    /* JADX INFO: renamed from: a */
    public boolean m17020a(Class cls) {
        return this.f13721a.containsKey(cls);
    }
}
