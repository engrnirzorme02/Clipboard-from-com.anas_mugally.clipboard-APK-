package com.google.gson.internal.sql;

import com.google.gson.AbstractC5059s;
import com.google.gson.C5026e;
import com.google.gson.InterfaceC5060t;
import com.google.gson.reflect.C5058a;
import java.sql.Timestamp;
import java.util.Date;
import p391x5.C7415a;
import p391x5.C7417c;

/* JADX INFO: renamed from: com.google.gson.internal.sql.c */
/* JADX INFO: loaded from: classes.dex */
class C5047c extends AbstractC5059s {

    /* JADX INFO: renamed from: b */
    static final InterfaceC5060t f19223b = new a();

    /* JADX INFO: renamed from: a */
    private final AbstractC5059s f19224a;

    /* JADX INFO: renamed from: com.google.gson.internal.sql.c$a */
    class a implements InterfaceC5060t {
        a() {
        }

        @Override // com.google.gson.InterfaceC5060t
        /* JADX INFO: renamed from: a */
        public AbstractC5059s mo22659a(C5026e c5026e, C5058a c5058a) {
            a aVar = null;
            if (c5058a.m22814c() == Timestamp.class) {
                return new C5047c(c5026e.m22625m(Date.class), aVar);
            }
            return null;
        }
    }

    /* synthetic */ C5047c(AbstractC5059s abstractC5059s, a aVar) {
        this(abstractC5059s);
    }

    @Override // com.google.gson.AbstractC5059s
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Timestamp mo22636b(C7415a c7415a) {
        Date date = (Date) this.f19224a.mo22636b(c7415a);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // com.google.gson.AbstractC5059s
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo22637d(C7417c c7417c, Timestamp timestamp) {
        this.f19224a.mo22637d(c7417c, timestamp);
    }

    private C5047c(AbstractC5059s abstractC5059s) {
        this.f19224a = abstractC5059s;
    }
}
