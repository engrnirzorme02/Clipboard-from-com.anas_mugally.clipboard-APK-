package com.google.firebase.auth;

import java.util.Map;

/* JADX INFO: renamed from: com.google.firebase.auth.w */
/* JADX INFO: loaded from: classes.dex */
public class C4882w {

    /* JADX INFO: renamed from: a */
    private String f18559a;

    /* JADX INFO: renamed from: b */
    private Map f18560b;

    public C4882w(String str, Map map) {
        this.f18559a = str;
        this.f18560b = map;
    }

    /* JADX INFO: renamed from: a */
    public Map m22058a() {
        return this.f18560b;
    }

    /* JADX INFO: renamed from: b */
    public String m22059b() {
        Map map = (Map) this.f18560b.get("firebase");
        if (map != null) {
            return (String) map.get("sign_in_provider");
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public String m22060c() {
        return this.f18559a;
    }
}
