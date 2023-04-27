/*
 *
 * The MIT License Copyright © 2018-2018 GourdErwa
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the
 * Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package io.gourd.design.patterns.mediator.colleague;

import io.gourd.design.patterns.mediator.Action;
import io.gourd.design.patterns.mediator.Colleague;
import io.gourd.design.patterns.mediator.Mediator;
import lombok.extern.slf4j.Slf4j;

/**
 * 封装与中介交互公共处理逻辑
 *
 * @author wei.Li
 */
@Slf4j
public abstract class BaseEstateAgentsColleague implements Colleague {
    /**
     * EstateAgentsMediator
     */
    private Mediator estateAgentsMediator;

    @Override
    public void joinedMediator(Mediator estateAgentsMediator) {
        log.info("{}\t参与中介", this);
        this.estateAgentsMediator = estateAgentsMediator;
    }

    @Override
    public void mediatorAction(Action action) {
        log.info("中介向[{}]发布一条[{}]信息", this, action);
    }

    @Override
    public void act(Action action) {
        if (estateAgentsMediator != null) {
            log.info("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            log.info("需求用户[{}]向中介发布一条信息[{}]", this, action);
            estateAgentsMediator.act(this, action);
        }
    }

    /**
     * toString
     *
     * @return toString
     */
    @Override
    public abstract String toString();

}
