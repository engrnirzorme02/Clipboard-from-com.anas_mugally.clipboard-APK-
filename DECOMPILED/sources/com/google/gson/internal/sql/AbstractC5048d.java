package com.google.gson.internal.sql;

import com.google.gson.InterfaceC5060t;
import com.google.gson.internal.bind.C5033c;
import java.sql.Date;
import java.sql.Timestamp;

/* JADX INFO: renamed from: com.google.gson.internal.sql.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5048d {

    /* JADX INFO: renamed from: a */
    public static final boolean f19225a;

    /* JADX INFO: renamed from: b */
    public static final C5033c.b f19226b;

    /* JADX INFO: renamed from: c */
    public static final C5033c.b f19227c;

    /* JADX INFO: renamed from: d */
    public static final InterfaceC5060t f19228d;

    /* JADX INFO: renamed from: e */
    public static final InterfaceC5060t f19229e;

    /* JADX INFO: renamed from: f */
    public static final InterfaceC5060t f19230f;

    /* JADX INFO: renamed from: com.google.gson.internal.sql.d$a */
    class a extends C5033c.b {
        a(Class cls) {
            super(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.gson.internal.bind.C5033c.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Date mo22665a(java.util.Date date) {
            return new Date(date.getTime());
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.sql.d$b */
    class b extends C5033c.b {
        b(Class cls) {
            super(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.gson.internal.bind.C5033c.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Timestamp mo22665a(java.util.Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z7;
        try {
            Class.forName("java.sql.Date");
            z7 = true;
        } catch (ClassNotFoundException unused) {
            z7 = false;
        }
        f19225a = z7;
        if (z7) {
            f19226b = new a(Date.class);
            f19227c = new b(Timestamp.class);
            f19228d = C5045a.f19219b;
            f19229e = C5046b.f19221b;
            f19230f = C5047c.f19223b;
            return;
        }
        f19226b = null;
        f19227c = null;
        f19228d = null;
        f19229e = null;
        f19230f = null;
    }
}
