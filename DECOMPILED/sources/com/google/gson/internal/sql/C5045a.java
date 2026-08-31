package com.google.gson.internal.sql;

import com.google.gson.AbstractC5059s;
import com.google.gson.C5026e;
import com.google.gson.C5052m;
import com.google.gson.InterfaceC5060t;
import com.google.gson.reflect.C5058a;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import p391x5.C7415a;
import p391x5.C7417c;
import p391x5.EnumC7416b;

/* JADX INFO: renamed from: com.google.gson.internal.sql.a */
/* JADX INFO: loaded from: classes.dex */
final class C5045a extends AbstractC5059s {

    /* JADX INFO: renamed from: b */
    static final InterfaceC5060t f19219b = new a();

    /* JADX INFO: renamed from: a */
    private final DateFormat f19220a;

    /* JADX INFO: renamed from: com.google.gson.internal.sql.a$a */
    class a implements InterfaceC5060t {
        a() {
        }

        @Override // com.google.gson.InterfaceC5060t
        /* JADX INFO: renamed from: a */
        public AbstractC5059s mo22659a(C5026e c5026e, C5058a c5058a) {
            a aVar = null;
            if (c5058a.m22814c() == Date.class) {
                return new C5045a(aVar);
            }
            return null;
        }
    }

    /* synthetic */ C5045a(a aVar) {
        this();
    }

    @Override // com.google.gson.AbstractC5059s
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Date mo22636b(C7415a c7415a) throws IOException {
        Date date;
        if (c7415a.m32824d1() == EnumC7416b.NULL) {
            c7415a.m32821Z0();
            return null;
        }
        String strM32822b1 = c7415a.m32822b1();
        synchronized (this) {
            TimeZone timeZone = this.f19220a.getTimeZone();
            try {
                try {
                    date = new Date(this.f19220a.parse(strM32822b1).getTime());
                    this.f19220a.setTimeZone(timeZone);
                } catch (ParseException e7) {
                    throw new C5052m("Failed parsing '" + strM32822b1 + "' as SQL Date; at path " + c7415a.m32830p0(), e7);
                }
            } catch (Throwable th) {
                this.f19220a.setTimeZone(timeZone);
                throw th;
            }
        }
        return date;
    }

    @Override // com.google.gson.AbstractC5059s
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo22637d(C7417c c7417c, Date date) throws IOException {
        String str;
        if (date == null) {
            c7417c.mo22681R0();
            return;
        }
        synchronized (this) {
            str = this.f19220a.format((java.util.Date) date);
        }
        c7417c.mo22687f1(str);
    }

    private C5045a() {
        this.f19220a = new SimpleDateFormat("MMM d, yyyy");
    }
}
